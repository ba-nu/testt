
package javaapplication9;

import java.util.*;

public class JavaApplication9 {

 
    public static void main(String[] args) {
       
        Scanner console=new Scanner(System.in);
        
        int firstNum=4;
       int secondNum=2*firstNum+6;
       char ch='A';
       double z=(firstNum+1)/2.0;
       secondNum = console.nextInt(); 
        
       z = console.nextDouble();  
        
       firstNum = (int)(z) + 8;
        System.out.println(firstNum);
       secondNum = secondNum + 1; 
        System.out.println(secondNum);
       ch = console.next().charAt(0);
        System.out.println(ch);
       
       firstNum =firstNum + (int)(ch);
        System.out.println(firstNum);
       
         
    }
    
}
