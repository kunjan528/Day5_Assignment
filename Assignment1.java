/*Input the lower bound and upper bound then print all the Fibonacci
numbers within the bound. The Fibonacci sequence starts with 0 
and 1, and each subsequent number is the sum of the two
preceding ones.
Test case : Input lower =5 and upper= 40
Output: 5 8 13 21 34
*/

import java.util.Scanner;
public class Assignment1{
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("lower :");
       int lower =  sc . nextInt();
       System.out.println("upper :");
       int upper =  sc . nextInt();

       int a = 0, b=1 , c=0;
       while(c <=upper)
       {
            if(a >= 1){
                System.out.println(c+" ");

            }
            a = b;
            b = c;
            int c = a + b;
            
       }
    }
}