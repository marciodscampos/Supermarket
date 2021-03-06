package csv;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by Marcio on 18/06/2015.
 */
public abstract class FileCsv {
    private File csv;

    public FileCsv(String fileName) {
        // Verifica se o diret�rio de dados j� foi criado
        File folder = new File("data");
        if (!folder.exists())
            folder.mkdir(); // Cria o diret�rio caso n�o tenha sido criado

        // Cria o arquivo dentro do diret�rio de dados
        csv = new File(folder, fileName);
    }

    public synchronized boolean store(String[] fields) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(csv, true);
            PrintWriter output = new PrintWriter(fileWriter);

            // Escreve os dados do usu�rio no arquivo
            int i;
            for (i = 0; i < fields.length - 1; i++) {
                output.printf("%s,", fields[i]);
            }
            output.printf("%s", fields[i]);
            output.printf("\n");

            output.close();
            fileWriter.close();
            return true;

        } catch (IOException e) {
            System.err.println("ERROR SAVING FILE!");
            e.printStackTrace();
            return false;
        }
    }

    public abstract ArrayList readAll();

    public File getCsv() {
        return csv;
    }
}