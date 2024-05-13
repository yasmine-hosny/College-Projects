package re;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RE {

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        
        System.out.println("Please entre a string: ");
        String A = sc.next();

        Pattern P = Pattern.compile("[ab]*"); 
        Matcher m = P.matcher(A);
        

if(m.matches()){

    if(A.contains("aaa")||A.contains("bbb")){
        System.err.println("wrong entry: more than 1 double");}
    else if(A.contains("aa")&&A.contains("bb")){
            System.err.println("wrong entry: two letters doubled");
    }else if(!A.contains("aa")&&!A.contains("bb")){
            System.err.println("wrong entry: does not contain double letters");
    }
    else{ System.out.println("Accepted");
    }
}else
    System.err.println("wrong entry: letters not a or b");

  }
}
