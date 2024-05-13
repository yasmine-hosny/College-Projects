package advansed;

public class Atm implements Bank {    
    
    @Override
    public void insertIdCard() {
        System.out.println("please Enter your Id Card");
    }

    @Override
    public void insertPassword() {
        System.out.println("please Enter your password Card");
    }

    @Override
    public void logout() {
        System.out.println("Thank you for using this Atm, bye..");
    }
    
    public void requestOption() {
        System.out.println("choose 1 => if you want check balance");
        System.out.println("choose 2 => if you want withderw");       
        System.out.println("choose 3 => if you want diposit");
        System.out.println("choose 4 => if you want look forward to Your Account");
        System.out.println("choose 5 => if you want Exist");
    }
    
    // overloading ...
    
    public void choose() {
        System.out.println("choose 1 => if you want other Operation"); 
        System.out.println("choose 2 => if you want Exist");
    }
    
    public void choose(int num) {
        if(num != 1 && num != 2)
            System.out.println("Invalid number");    
    }

}
