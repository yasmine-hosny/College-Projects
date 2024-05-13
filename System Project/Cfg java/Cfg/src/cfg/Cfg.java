package cfg;

import java.util.Random;
import java.util.Scanner;

public class Cfg {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("would you like to double the a or the b? true = a , false = b ");
        Boolean choice = sc.nextBoolean();
        
            int min1 = 0;
            int max1 = 10;
            int length_of_string = (int)Math.floor(Math.random()*(max1-min1+1)+min1);
            int before_double = (int)Math.floor(Math.random()*(max1-min1+1)+min1);
            int after_double = Math.abs(length_of_string -(2+before_double));

            if(choice==true){
            char[] c = new char[before_double];
            for(int i = before_double-1;i>0;i=i-2){
                c[i]='b';
                 c[i-1]='a';
            }
            String A = String.copyValueOf(c)+"aa";
//            System.out.println(A);
            
            char[] d = new char[after_double+1];
           for(int i=0; i<after_double;i=i+2){
               d[i]='b';
               d[i+1]='a';
           }
           String B = String.copyValueOf(d);
//           System.out.println(B); 

           
           String fullstring = A+B;
          System.out.println(fullstring); 
    }
            
    else{
     char[] c = new char[before_double];
            for(int i = before_double-1;i>0;i=i-2){
                c[i]='a';
                c[i-1]='b';
            }
            String A = String.copyValueOf(c)+"bb";
//            System.out.println(A);
            
            char[] d = new char[after_double+1];
           for(int i=0; i<after_double;i=i+2){
               d[i]='a';
               d[i+1]='b';
           }
           String B = String.copyValueOf(d);
//           System.out.println(B); 

           
           String fullstring = A+B;
          System.out.println(fullstring);
    }
    
    }
    
}
