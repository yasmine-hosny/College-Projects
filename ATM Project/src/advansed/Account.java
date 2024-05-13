package advansed;

public class Account extends Customer {
    static protected int amount;            
    private PersonalInformation personInfo;

    public Account() {
    }


    public Account(String firstName, String lastName, String address, String email, int numphone) {
        this.personInfo = new PersonalInformation(firstName, lastName, address, email, numphone);
    }
    
    public void setAmount(int amount) {
        this.amount = amount;
    }
    
    public int getAmount() {
        return amount;
    }
    
    public int calcWithdrawAmount(int WithdrawAmount) {
        amount -= WithdrawAmount;
        return amount; 
    }
     
    public int calcdepositAmount(int depositAmount) {
        amount += depositAmount;
        return amount;
    }

    @Override
    public String toString() {
        return "Account{" + "personInfo=" + personInfo + '}';
    }
   
}
