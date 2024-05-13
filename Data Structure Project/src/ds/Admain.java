package ds;

public class Admain {
    private int id;
    private int password;
    private PersonalInformation personInfo;
    
    public Admain(String name, String Phone, String email, String address, String city) {
        this.personInfo = new PersonalInformation(name, Phone, email, address, city);
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Admain{" + "personInfo=" + personInfo + '}';
    }
}
