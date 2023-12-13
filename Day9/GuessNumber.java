
import java.util.*;

class GuessNumber
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int rnum , guess , nguess = 0;
        rnum = (int)(Math.random() * 100 ) + 1;
        System.out.println("Guess the number : ");
        do
        {
            guess = sc.nextInt();
            if(guess > rnum)
            {
                System.out.println("Enter a number smaller than " + guess);
            }
            else if(guess < rnum)
            {
                System.out.println("Enter a number greater than " + guess);
            }
            else
            {
                System.out.println("Congrats !!! Your guess is correct. The number is " + guess);
            }
            nguess = nguess + 1 ;
        }while(guess != rnum);
        System.out.println("Your number of attempt is : " + nguess);
    }
}