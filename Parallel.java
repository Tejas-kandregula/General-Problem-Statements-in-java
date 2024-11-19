/* Two vectors are parallel to each other if one can be expressed as a scalar multiple of the other. 
For example,[1,2,3] and [4,8,12] are parallel because [4,8,12]=4.[1,2,3]. The expression 4.[1,2,3]
 stands for  the vector obtained by multiplying each element of [1,2,3] by 4. In general, 
two vectors  and  are parallel, if we there is a non-zero scalar  such that: 
Input Output
 1 2 3 4
 5 10 15 20
                              parallel
 1 0 2 3 4 9 1
 10 0 20 -30 40 90 10
                               not parallel
*/
import java.util.*;
public class Parallel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        int [] b = new int[n];
        for(int i=0;i<=a.length-1;i++)
        {
            a[i] = sc.nextInt();
        }
        for(int i=0;i<=b.length-1;i++)
        {
            b[i] = sc.nextInt();
        }
        if(Arrays.equals(a,par(b, n)))
        {
            System.out.println("parallel");
        }
        else
        {
            System.out.println("not parallel");
           // System.out.println(5/5);
        }
    }
    public static int[] par(int []b,int n)
    {
        int [] c = new int[n];
        int a = b[0];
        for(int i=0;i<=c.length-1;i++)
        {
            c[i]=b[i]/a;
            System.out.println(Arrays.toString(c));
        }
        return c;
    }
    
}
