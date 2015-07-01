package market;

/**
 * Created by Marcio on 17/06/2015.
 */
public class User {
    private String Name;
    private String address;
    private String phone;
    private String email;
    private String id;
    private String password;

    public User(String Name, String address, String phone, String email, String id, String password){
        this.Name = Name;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.id = id;
        this.password = password;
    }

    public User(String[] fields){
        this.Name = fields[0];
        this.address = fields[1];
        this.phone = fields[2];
        this.email = fields[3];
        this.id = fields[4];
        this.password = fields[5];
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return Name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }
}
