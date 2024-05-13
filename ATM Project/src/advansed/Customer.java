package advansed;

public class Customer {
    protected int id;
    protected int password;
    protected int WithdrawAmount;
    protected int depositAmount;

    public void setId(int id) {
        this.id = id;
    }
    
    public int getId() {
        return id;
    }
    
    public void setPassword(int password) {
        this.password = password;
    }
    
    public int getPassword() {
        return password;
    }

    // overloading...
    
    public void setWithdrawAmount(int amount) {
        this.WithdrawAmount = amount;
    }
    
    public void setdepositAmount(int amount) {
        this.depositAmount = amount;
    }  
    
}
