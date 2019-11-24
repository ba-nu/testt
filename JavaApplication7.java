/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;
import java.util.*;
/**
 *
 * @author Click
 */
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        int a1=x.nextInt();
        int a2=x.nextInt();
        int a3=x.nextInt();
        if(a1>a2 && a1>a3){
            System.out.println("a1 is oldest");
        }
        else if(a2>a1 && a2>a3)
        {System.out.println("a2 is oldest");
        } 
        else 
            System.out.println("a3 is oldest");
        
         if(a1<a2 && a1<a3){
            System.out.println("a1 is youngest");
        }
        else if(a2<a1 && a2<a3)
        {System.out.println("a2 is youngest");
        } 
        else 
            System.out.println("a3 is youngest");
            
            
            
            
    }
    
}
