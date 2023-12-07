
// Palindrome using Recursion

import java.util.*;

public class Main
{
    static int  ans = 0;
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        reverse(n);
        if(n == ans)
        {
            System.out.println(n + " is a Palindrome number");
        }
        else
        {
            System.out.println(n + " is not a Palindrome number");
        }
    }

    static void reverse(int n)
    {
        if(n == 0)
        {
            return ;
        }
        int rem = n % 10;
        ans = ans * 10 + rem;
        reverse(n/10);
    }
}