/*
5) Write a Java program to print the sum of squares of numbers from 1 
to n using a for loop.
Test Case: Enter the value of n = 5
Sum of squares of 1st 5 numbers = 55
*/
import java.util.Scanner;
public class Assignment4
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n:");
        int n = sc.nextInt();
        int sum = 0;
        System.out.print("Sum of squares of 1st 5 numbers :");
        for(int i =1 ; i<=5 ; i++)
        {
            int sq= i  * i;
            sum = sum + sq;
            
            
        }
        System.out.print(" "+sum);
    }
}