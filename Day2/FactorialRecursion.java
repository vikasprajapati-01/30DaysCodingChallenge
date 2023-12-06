
import java.util.*;

public class FactorialRecursion
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number whose factorial is needed:");
        int n = sc.nextInt();
        int ans = factorial(n);
        System.out.println("The Factorial is : " + ans);
    }

    static int factorial(int n)
    {
        if(n <= 1)
        {
            return 1;
        }

        return n * factorial(n-1);   // Will give the factorial
    }
}