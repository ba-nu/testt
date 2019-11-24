
package javaapplication10;

import java.util.*;



public class JavaApplication10 {

   
    public static void main(String[] args) {
        
        Scanner b= new Scanner(System.in);
        
        System.out.println("add firstNum");
        int firstNum=b.nextInt();
        
        System.out.println("add secoundNum");
       int secoundNum=b.nextInt();
       
       if(firstNum==secoundNum) {
           System.out.println("firstNum is equal to secoundNum");
       }
       
        if(secoundNum<firstNum){
        
        
            System.out.println("secoundNum is smaller");
        
        
    }
        if(secoundNum>firstNum){
       
        
            System.out.println("secoundNum is largest");
}
}
}