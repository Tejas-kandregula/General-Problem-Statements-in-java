// WAP TO PRINT SUM OF DIVISORS OF A NUMBER
/* I/P : 6
 * O/P : 12
 * EXP : 1+2+3+6 = 12
 */
import java.util.Scanner;

public class SumOfDivisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum =0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                sum = sum+i;
            }
        }
        System.out.println(sum);
    }
    
}
