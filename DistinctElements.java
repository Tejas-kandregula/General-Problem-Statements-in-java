/* Write a code to accept the sequence of positive integers in sorted order(either in non ascending 
order or non descending order) ending with -1 and at least two  integers must be before -1 . In 
Output print the number of distinct elements in the sorted sequence before -1.
 Sample Input - 1
 1 2 -1
 Sample Output - 2
 Sample Input - 2
 7 6 6 5 5 -1
 Sample Output - 3 */
import java.util.*;
public class DistinctElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        for(int i=0;i<=a.length-1;i++)
        {
            a[i] = sc.nextInt();
        }
        int count=0;
        for(int i=0;i<=a.length-2;i++)
        {
            if(a[i]!=a[i+1])
            {
                count++;
               // System.out.println(count);
            }
            else{
                continue;
            }
        }
       System.out.println(count);
        
    }
    
}
