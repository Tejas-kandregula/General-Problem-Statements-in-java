

// Problem Staternent

// The function calculate_sellingprice() accepts the parameters int cost price,int no_of items and int profit Complete the function calculate sellingprice) and return the setting price of the ormat. For example if the cost price of each item is 20, number of items is 10 and the profit to be earned is 20%, the output Le, the selling price of each dam is 240

// Example 1

// nput

// cost price 15,no_of_items = 10,profit- 20

// Output:

// 18.0

// Example 2

// Input

// cost_price 1,no_of_items 20,profit= 100

// Output

// 2.0


import java.util.*;
public class Selling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cp = sc.nextInt();
        int num = sc.nextInt();
        int profit = sc.nextInt();
        System.out.println(calculateSellingPrice(cp, profit,num));
    }
    public static float calculateSellingPrice(int cp, int profit,int num)
    {
        float sp = (profit*cp)/100 + cp;
        return sp;
    }
    
    
}
