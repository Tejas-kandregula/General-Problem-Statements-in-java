 /* Write a program to accept the two positive integers 
start and 0< stop where start<stop<=100 print all numbers from start to stop both inclusive with following constraints.
 If the number is divisible by 3 print 
Divisible by 3 at the place of number.
 If the number is divisible by 5 print 
Divisible by 5 at the place of number.
 If the number is divisible by 10 print 
Divisible by 10 at the place of number.
 If the number is divisible by any of two from 3 ,5 and 10 , print nothing, just skip.
 If the number is divisible by all ( 3 , 5 and 10) , stop printing the number.
 If the number is not divisible by any of ( 3 , 5 and 10) , just print the number as it is */

import java.util.*;
public class Divisibleby3510 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int stop = sc.nextInt();
        for(int i=start;i<=stop;i++)
        {
             if(i%3==0 && i%5==0 && i%10==0)
            {
                break;
            }
            else if((i%3==0 && i%5==0)||(i%5==0 && i%10==0)|| (i%3==0 && i%10==0))
            {
                continue;
            }
           else if(i%3==0)
            {
                System.out.println("div by 3");
            }
            else if(i%5==0)
            {
                System.out.println("div by 5");
            }
            else if(i%10==0)
            {
                System.out.println("div by 10");
            }
            else
            {
                System.out.println(i);
            }
        }
        
    }
    
}
