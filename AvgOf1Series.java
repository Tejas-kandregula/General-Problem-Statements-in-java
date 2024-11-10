/* Write a code to accept the positive integer 
n from user and print average of 
1111 + ..n terms.
 Input
 6
so series will be 
1 + 11 + 111 + 1111 + 11111 + 111111
 Output
 20576.0
  */
import java.util.*;
public class AvgOf1Series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float avg =0;
        int sum =0,pow=1;
        int num=0;
        for(int i=0;i<n;i++)
        {
            num = num +pow;
            sum = sum+num;
           // System.out.println(sum);
            pow = pow*10;
        }
        avg = sum/n;
        System.out.println(avg);
        
    }
    
}
