/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advansed;

/**
 *
 * @author Mega
 */
public class PersonalInformation {
    private String firstName; 
    private String lastName; 
    private String address;
    private String email;
    private int numphone;

    public PersonalInformation() {
    }

    public PersonalInformation(String firstName, String lastName, String address, String email, int numphone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.email = email;
        this.numphone = numphone;
    }

    @Override
    public String toString() {
        return "PersonalInformation{" + "firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", email=" + email + ", numphone=" + numphone + '}';
    }
   
}
