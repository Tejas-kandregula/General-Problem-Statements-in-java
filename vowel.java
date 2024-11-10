/* Write a program to accept the string s  from the user and print all alphabets in one line separated by , before first occurrence of vowel . */

import java.util.*;
public class vowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s1 = s.toLowerCase();
        char [] a = s1.toCharArray();
        for(int i=0;i<=a.length-1;i++)
        {
            char b = a[i];
            if((a[i]=='a')||(a[i]=='e')||(a[i]=='o')||(a[i]=='u'))
            {
                break;
            }
            else
            {
                System.out.print(b+",");
            }
        }
        
    }
    
}
