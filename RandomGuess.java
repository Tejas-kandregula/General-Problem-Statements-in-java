/* Write a program to number guessing game using loops. The program arbitrarily choses a number 
in the range 1 to 100 (inclusive) and asks user to enter a guessed number.  The program 
repeatedly asks user to guess the number 5 times. For each guess, the program says TOO HIGH or TOO LOW or GOOD based on the below table.
 Difference
 output
 actual_number - guess_number = 0
 EXCELLENT
 (actual_number - guess_number <= 10) 
 GOOD
 guess_number - actual_number > 10
 TOO_HIGH
 actual_number - guess_number > 10
 TOO_LOw */
 import java.util.*;
public class RandomGuess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = (int)(Math.random()*101);
        for(int i=1;i<=5;i++)
        {
            int num = sc.nextInt();
            if(a-num==0)
            {
                System.out.println("Excellent");
            }
            else if((num-a >10))
            {
                System.out.println("Too high");
            }
            else if((a-num <=10))
            {
                System.out.println("Good");
            }
            else
            {
                System.out.println("Too low");
            }
        }
        System.out.println(a);

        
    }
    
}
