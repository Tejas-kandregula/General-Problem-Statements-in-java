// To Print 3rd last consonant in the given String
/* I/p : string length (9)
 * I/P2 : String value (asdfguihj)
 * O/P : g since i,u are vovels j=1,h=2,g=3(3rd consonant)
 */

import java.util.Scanner;

public class ConsonantOfaThirdString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s1 = sc.next();
        String a = s1.toLowerCase();
        int count =0;
        int count2 =0;
        for(int i=s1.length()-1;i>=0;i--)
        {
            char ch = a.charAt(i);
            if(ch=='a' || ch == 'e' || ch=='i' || ch=='o' || ch=='u')
            {
               count2++;
            }
            else
            {
                count++;
            }
            if(count==3)
            {
                System.out.println(ch);
                break;
            }
        }
    }

    
}
