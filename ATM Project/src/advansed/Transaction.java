package advansed;

import java.util.Scanner;

public class Transaction extends Account {

    Scanner input = new Scanner(System.in);
    public int calcWithdrawAmount() {
         System.out.println("Enter withdrawAmount");
        int x = input.nextInt();
        int amt = calcWithdrawAmount(x);
        if(amt >= 0)
            System.out.println("withdrawed and Your Amount become  " + amt);
        else
        {
            System.out.println("You can't withdraw ");
            amount += x;
        }
        amount -= WithdrawAmount;
        return amount; 
    }
    
    public void calcdepositAmount() {
        System.out.println("Enter DepositAmount");
        System.out.println("Your Amount become  " + calcdepositAmount(input.nextInt()));
    }
    
    public void transactions(int num) {
        switch(num) {
            case 1:
                System.out.println(getAmount());
            break;
            case 2:
               calcWithdrawAmount();
            break;    
            case 3:
               calcdepositAmount();
            break; 
            case 4:
            break;
            case 5:
                System.out.println("Thank you for using this Atm, bye..");
                System.exit(0);
            break;
            default:
                System.out.println("Invalid number");
        }
    }
 
}
