/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.finocci;

/**
 *
 * @author meetk
 */
import java.util.*;

class Finocci
{
    static boolean isPerfectSquare(int x)
    {
        //calculating sqaure root of number
        int squrot = (int) Math.sqrt(x);

        //find floor value 
        return  (squrot*squrot == x);   
    }
    
    static boolean isFibonacci(int x)
    {
        return isPerfectSquare(5*x*x + 4) || isPerfectSquare(5*x*x - 4);
    }

    public static void main(String[] args) {
        int first=0, second=1, j = 0, Final;
        int [] ffb_num = new int[50];
        
        System.out.println("Enter the F value");
        Scanner scan = new Scanner(System.in);
        int f = scan.nextInt();


        System.out.println(first);
        System.out.println(second);

        for (int i = 2; i< f; ++i)// i already print 0 and 1 thats why i=2
        {
            Final = first + second;
            ffb_num[j] = Final;
            
            System.out.println(Final);
            first=second; //first=1
            second=Final;  //sendond=1
            j++;
        }
        
        
        //check it is finocci number or not.             
        System.out.println("Enter the Number");
        int n = scan.nextInt();
        
        if (isFibonacci(n)) {
            System.out.println(n + " is fabonacci number");
        } else {
            int final_number = 0;
            int closet = Math.abs(ffb_num[0] - n);
            int diff;

            for (int k = 0; k < ffb_num.length; k++) {
                diff = Math.abs(ffb_num[k] - n);
                if (diff < closet) {
                    closet = diff;
                    final_number = ffb_num[k];
                }
            }
            System.out.println(n + " is not a fabonacci number");
            System.out.println("Closet Number to fabonacci number is " + final_number);
        }
    }
}


    

