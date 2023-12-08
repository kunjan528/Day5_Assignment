/*
2) Write a program to print first 10 even Fibonacci numbers
Output: 0 2 8 34 144 610 2584 10946 46368 196418
*/
import java.util.Scanner;
public class Assignment2
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int x = 0;
        int b = 1;
        int d = 10;
        int count = 1;
        System.out.print("Output :");

        for(int x = a ;count<=d;x++)
        {
            if(a % 2 == 0){
                    System.out.print(a+" ");
                    count ++;
            }
            int c = a+b;
            a = b;
            b = c;
        }
    }
}