/* You are given the results of a sequence of matches played by India in ODIs. A win is represented 
by 'W' and a loss is represented by 'L' . A winning streak is a string of consecutive wins. For 
example, if India has played five matches with the following results - 
'WLWWWL' - then it has a three-match streak. Accept the result-sequence as input and find the longest streak in it */
import java.util.*;
public class WinStreak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(winningStreak(s));
        
    }
    public static int winningStreak(String s)
    {
        char [] a = s.toCharArray();
        int max =0;
        int current = 0;
        for(int i=0;i<=a.length-1;i++)
        {
          if(a[i]=='w')
          {
            current++;
            max = Math.max(max, current);
          }
          else
          {
            current=0;
          }
        }
        return max;
    }
    
}
