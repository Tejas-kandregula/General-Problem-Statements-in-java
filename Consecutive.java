/* Write a code to accept the string  of length 10 from the user and print True if string has any 
character occurring 5 times consecutively in it, otherwise print False */
import java.util.*;
public class Consecutive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char [] ch = s.toCharArray();
      //System.out.println(s);
      //System.out.println(Arrays.toString(ch));
      if(ch.length==10)
      {
      int count =1;
      for(int i=1;i<=4;i++)
      {
         if(ch[0]==ch[i])
         {
            count++;
         }
      }
      if(count==5)
      System.out.println(true);
      else
      System.out.println(false);
    }
    else
    System.out.println(false);
    }
    
}
