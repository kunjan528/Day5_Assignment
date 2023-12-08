/*3) Write a java program to find the power of a number.
Make the user to enter two numbers, keep the second
number as power of first using for loop
Test Case : Input 2 3
Output 2
3 = 8
*/
import java.util.Scanner;
public class Assignment3
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("base   , index :");
        int base = sc.nextInt();
        int index = sc.nextInt();
        int multi = 1;
         for(int i = 0;i<index ;i++)
         {
             multi = multi * base;
            
         }
        
        // double  power =;
         //System.out.print(power);
         System.out.println(multi); 

    }
}