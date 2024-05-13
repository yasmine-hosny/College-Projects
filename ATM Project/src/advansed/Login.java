package advansed;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.IOException;


public class Login {
    
    public static void main (String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        star r = new star();
        Customer customer = new Customer();
        Transaction tran = new Transaction();
        Account account = new Account( "Yasmine",  "Hosny",  "Alexandria",  "@gmail", 1234563);
        Atm atm = new Atm(); 
        account.setAmount(500);
        account.getAmount();
        
        File file = new File("input.txt");
        FileReader fr = null;
        FileWriter fw = new FileWriter("output.txt");
        
        String str = "Atm Project By Yasmine ..";
        for(int i=0 ; i<str.length(); i++) {
            fw.write(str.charAt(i));
        }
        fw.close();
        
        try{
            fr = new FileReader(file);
        }catch(FileNotFoundException ex){
            System.out.println("File doesn't exist");
        }
        
        int ch;
        while((ch = fr.read()) != -1) {
            System.out.println( (char) ch);
        }
        fr.close();
        
        try{
           atm.insertIdCard();
           int id = input.nextInt();
           customer.setId(id);
           atm.insertPassword();
           int pass = input.nextInt();
           customer.setPassword(pass);

        }catch(Exception ex) {
           System.err.println("Invalid character, Please Enter Numbers only");
           System.exit(0);
        }
        r.run();

        
        int num = 0;
        do{
            atm.requestOption();
            int x = input.nextInt();
            if(x == 4)
                System.out.println(account.toString());
            tran.transactions(x);
            r.run();
            atm.choose();
            num = input.nextInt();
            atm.choose(num);
        }while(num == 1);
        
        atm.logout();
}
}