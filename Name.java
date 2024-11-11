/* Write a code to accept the name of a person as input and print the initials as output. Assume that 
the name will be of this form: 
<first name> <last name>. Also assume that the first name and last name will be a single word, and there will be exactly one space between the two names. For 
example, if the input is Rohit Sharma, the output should be RS  */
import java.util.*;
public class Name {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String s = a.toUpperCase();
        char [] b = s.toCharArray();
        System.out.println(Arrays.toString(b));
        System.out.print(b[0]);
        for(int i=0;i<=b.length-1;i++)
        {
            if(b[i]==' ')
            {
                System.out.print(b[i+1]);
            }
        }
       
        
    }
    
}
