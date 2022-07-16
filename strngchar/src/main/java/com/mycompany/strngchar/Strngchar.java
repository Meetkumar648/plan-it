/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.strngchar;

/**
 *
 * @author meetk
 */
import java.util.*;

public class Strngchar
{
    public static void main(String[] args)
    {              
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello Welcome");
               
        System.out.println("Enter Your String");
        String a = sc.nextLine();
         
        System.out.println("You have entered= "  + a);
        
        int sLength = a.length(); //4
        int withoutgape = a.replace(" ", "").length();
        
        System.out.println("The Length of your String is=" + sLength);
        System.out.println("The Length of Your String Without Space is=" + withoutgape);
        
        //str = A = MEET, [0 => "M", 1 => "E", 2 => "E", 3=> "T"]
        for (int i=0; i < sLength; i++) { //convert string into char 
            char currentchar = a.charAt(i);
            System.out.println(currentchar);    
        }
        //
        //store ASCII value of character
        int [] array = new int[256]; //create array 256 including all ascii values
        
        for (int i=0; i < sLength; i++) {
            //array["M"] = 1;
            //array["E"] = 2;
            //array["T"] = 1;
            array[a.charAt(i)]= array[a.charAt(i)]+1; //convert into ascii value  
        }
        
        //now find max value. 
        int max = -1;
        char finaloutput = ' ';
        
        //print value of max number
        for (int i=0; i < sLength; i++) {
            if (max < array[a.charAt(i)]) {  //-1 less than 97 (1)
                max = array[a.charAt(i)];
                finaloutput = a.charAt(i);
            }
        }
        System.out.println("Most number of Character is " + finaloutput);        
    }
}