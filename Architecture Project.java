package javaapplication1;

import java.io.*;
import java.util.Scanner;

public class JavaApplication1 {
      private static final char[][] precedence = {
        {'(','0'},
        {'/','1'},
        {'*','1'},
        {'+','2'},
        {'-','2'} 
    };

    private static int precedenceOf(String t){
        char token = t.charAt(0);
        for (int i=0; i < precedence.length; i++){
            if(token == precedence[i][0]){
                return Integer.parseInt(precedence[i][1]+"");
            }
        }
        return -1;
    }

    public static void main(String[] args) throws Exception{
        int i, j, opc=0;
        char token;
        boolean processed[];
        String[][] operators = new String[10][2];
        String expr = "", temp;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("\n Enter an expression for calculating Address codes : ");
        expr = in.readLine();
        processed = new boolean[expr.length()];
        for (i=0; i<processed.length; i++){
            processed[i] = false;
        }
        for (i=0; i< expr.length(); i++){
            token = expr.charAt(i);
            for (j=0; j< precedence.length; j++){
                if(token == precedence[j][0]){
                    operators[opc][0] =token+"";
                    operators[opc][1] = i+"";
                    opc++;
                    break;
                }
            }
        }

//        System.out.println("\n Operators: \n Operators \t Location number\n ");
//        for (i=0; i<opc; i++){
//            System.out.println(operators[i][0] + "\t\t" + operators[i][1]);
//        }
        //sort
        for (i=opc-1; i >= 0; i--){
            for(j=0; j<i; j++){
                if(precedenceOf(operators[j][0]) > precedenceOf(operators[j+1][0])) {
                    temp = operators[j][0];
                    operators[j][0] = operators[j+1][0];
                    operators[j+1][0] = temp;
                    temp = operators[j][1];
                    operators[j][1] = operators[j+1][1];
                    operators[j+1][1] = temp;
                }
            }
        }
        
//        System.out.println("\n Operators sorted in their precedence : \n Operators \t Location number \n");
//        for (i=0; i<opc; i++){
//            System.out.println(operators[i][0] + "\t\t" + operators[i][1]);
//        }
//        System.out.println();

        
        for (i = 0; i < opc; i++){
            j = Integer.parseInt(operators[i][1] + "");
            String op1 = "", op2 = "";
          if( processed[j-1]== true){
                   
                if (precedenceOf(operators[i-1][0])== precedenceOf(operators[i][0])){
                    op1 = "t" +i;
                }
                else{
                    for (int x = 0; x < opc; x++){
                        if((j-2)== Integer.parseInt(operators[x][1])){
                            op1 = "t" + (x+1) + "";
                        }
                    }
                }
                
//                if(precedenceOf(operators[i][0]) == '*')
//                System.out.println("Mult"+op1+operators[i-1][1]+operators[i][1]);
            }
            else{
                op1 = expr.charAt(j-1) + "";
            }
          
            if (processed[j+1] == true){
                for(int x = 0; x < opc; x++){
                    if((j+2) == Integer.parseInt(operators[x][1])){
                        op2 = "t" + (x + 1) + "";
                    }
                }
            }
            else{
                op2 = expr.charAt(j+1) + "";
            }
            
           // System.out.println("t"+ (i+1) + " = " + op1 + operators[i][0] + op2);
            
            if("*".equals(operators[i][0]))
                System.out.println("Mult  t" + (i+1) + "  " + op1 + "  " + op2);
            else if("/".equals(operators[i][0]))
                System.out.println("Div  t" + (i+1)  + "  " + op1 + "  " + op2);
            else if("+".equals(operators[i][0]))
                System.out.println("Add  t" + (i+1)  + "  " + op1 + "  " + op2);
            else
                System.out.println("Minus  t" + (i+1)  + "  " + op1 + "  " + op2);

            processed[j] = processed[j-1] = processed[j+1] = true;
            
            if(i == opc-1)
                System.out.println("Store  " + expr.charAt(0) + "   t" + (i+1) );
        }
}
}

//if(precedenceOf(operators[i-1][0])== precedenceOf(operators[i][0]) &&  precedenceOf(operators[i][0]) == '(') {
//                    if(operators[i+2][1])
//                }
//                else{ 