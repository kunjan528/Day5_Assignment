/*
Write a Java program to calculate and print the sum of the series: 
1+1/2+1/3+…+1/n using a for loop.
Test Case: Enter the value of n =5 
Sum of the series = 2.28333
*/
import java.util.Scanner;
public class Assingment4
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the value of n =");
        double n = sc.nextDouble();
       // double n = 0.0;
        double sum = 0.0;
        for(double i = 1.0 ;i<=n ;i++)
        {
            sum = sum  + 1.0/i;
            
        }
         System.out.print("Sum of the series:"+sum);

    }
}