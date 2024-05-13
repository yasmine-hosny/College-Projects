package ds;

import java.util.Scanner;

public class Student {
    Scanner input = new Scanner(System.in);
    private int id;
    private int password;  
    private PersonalInformation personInfo;
    
    public Student(String name, String Phone, String email, String address, String city) {
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
    
    public void addStudent() {
        System.out.println("Enter Student Id and Student Password , Student Phone , Student Email , Student Address and Student City");
    }
}
