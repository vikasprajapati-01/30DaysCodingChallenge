
import java.util.*;

public class CheckIfSorted
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.println("Enter 5 elements : ");
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }

        boolean ans = check(arr, 0);
        System.out.println(ans);
    }

    static boolean check(int[] arr, int index)
    {
        if(index == arr.length-1)
        {
            return true;
        }

        return arr[index] < arr[index + 1] && check(arr, index + 1);
    }
}