package com.mycompany.strngchar;
/**
 *
 * @author meetk
 */

import java.util.*;
public class NewClass
{
    public static void main(String[] args) {
	System.out.println("Enter your string:");
        /* String k="kanchan"; */
        Scanner in = new Scanner(System.in);
		 
        String k = in.nextLine();
		 
        char tempArray[] = k.toCharArray(); //convert string into array char
        //  Arrays.sort(tempArray); 
        String s = new String(tempArray);
        int n = s.length();
        int max_count = 0;
        int count = 1;
        char ans = '-';
        int withoutGape = k.replace(" ", "").length();
        
        System.out.println("The Length of your String is=" + n);
        System.out.println("The Length of Your String Without Space is=" + withoutGape);
        //
        for (int i = 1; i <= n; i++)
        {
            if ((i == n) || (s.charAt(i) != s.charAt(i - 1)))
            {
                if (max_count < count)
                {
                    max_count = count;
                    ans = s.charAt(i-1);
                }
                count = 1;
            }
            else
            {
                count++;
            }
        }
    System.out.println("Maximum occurring character is "+ans);
  }
}
