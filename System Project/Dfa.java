/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dfa;
import java.util.Scanner;

/**
 *
 * @author aya
 */
public class Dfa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         char ch;
      System.out.println("please Enter character");
                      Scanner input = new Scanner (System.in);
      ch=input.next().charAt(0);
       int state;
             System.out.println("please Enter no. of state");
      state = input.nextInt();
      
            
          if(state == 1 && ch == 'a'){
         System.out.println(" state 2 ");
                   System.out.println(" continue:");
        }else if(state == 2 && ch == 'a'){
         System.out.println(" state 5 : continue");
        }else if(state == 3&& ch=='a'){
          System.out.println(" state 4 : continue");
        }else if(state == 4 && ch == 'a'){
          System.out.println(" state 5 : continue");
        }else if(state == 5 && ch == 'a'){
          System.out.println(" state 6 : continue");
        }else if(state == 6 && ch == 'a'){
          System.out.println(" state 7: continue");
        }else if(state == 7&& ch=='a'){
          System.err.println(" dead state");
        }else if(state == 8&& ch=='a'){
          System.out.println(" state 2: continue");
        }else if(state == 9 && ch == 'a'){
          System.out.println(" state 10: continue");
        }else if(state == 10 && ch == 'a'){       
          System.out.println(" state 5: continue");
        }else if(state == 11&& ch == 'a'){
          System.out.println(" state 12 : continue");
        }else if(state == 12&& ch=='a'){
          System.out.println(" state 13 : continue");
        }else if(state == 13 && ch== 'a'){
          System.out.println(" state 14 : continue");
        }else if(state == 14&& ch == 'a'){
          System.err.println(" dead state");
        }else if(state == 15&& ch=='a'){
          System.out.println(" state 14 : continue");
    
        }else if(state == 1 && ch == 'b'){
          System.out.println(" state 9 : continue");
        }else if(state == 2 && ch == 'b'){
          System.out.println(" state 3: continue");
        }else if(state == 3&& ch=='b'){
          System.out.println(" state 13 : continue");
        }else if(state == 4 && ch == 'b'){
          System.out.println(" state 8 : continue");
        }else if(state == 5 && ch== 'b'){
          System.out.println(" state 6 : continue");
        }else if(state == 6 && ch == 'b'){
          System.err.println(" dead state");
        }else if(state == 7&& ch=='b'){
          System.out.println(" state 6: continue");
        }else if(state == 8&& ch=='b'){
          System.out.println(" state 13 : continue");
        }else if(state == 9 && ch == 'b'){
          System.out.println(" state 13 : continue");
        }else if(state == 10 && ch == 'b'){
          System.out.println(" state 11 : continue");
        }else if(state == 11&& ch == 'b'){
          System.out.println(" state 13 : continue");
        }else if(state == 12&& ch=='b'){
          System.out.println(" state 9 : continue");
        }else if(state == 13 && ch == 'b'){
          System.err.println(" dead state");
        }else if(state == 14&& ch == 'b'){
          System.out.println(" state 15 : continue");
        }else if(state == 15&& ch=='b'){
          System.err.println(" dead state");
        }else{
            System.err.println("invaled input");
        }
          
        
    }
    
}
