
import java.util.*;

public class BinarySearch
{
    // The array must be sorted for using this method
    // Searching the element by Binary search method (First divide and then search)
    static int search(int[] arr, int target)
    {
        int start = 0;
        int end = arr.length-1;
        int ans;
        while(start<=end)
        {
            // Taking the middle number
            int mid = start + (end-start)/2;
            // Check whether the mid element is equal, greater or smaller to the mid element of the array
            if(target < arr[mid])
            {
                end = mid-1;
            }
            else if(target > arr[mid])
            {
                start = mid+1;
            }
            else if(target == arr[mid])
            {
                ans = mid;
                return ans;
            }
        }
        ans = -1;
        return ans;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,3,5,7,9,11,13,15,17,19,21,23,25,27,29,31,33,35,37,39,4,43,45,47,49,51};
        int target;
        System.out.println("Enter the number you want to search:");
        target = sc.nextInt();

        int res = search(arr, target);
        if(res == -1)
        {
            System.out.println("Number " + target + " is not present in the array");
        }
        else
        {
            System.out.println("Number " + target + " is present in the array");
        }
    }
}