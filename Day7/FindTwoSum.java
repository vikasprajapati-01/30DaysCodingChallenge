import java.util.*;

class FindTwoSum
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the number of inputs to be read : ");
        n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements : ");
        for(int i = 0; i < n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int target;
        System.out.println("Enter the target to find : ");
        target = sc.nextInt();
        Solution obj = new Solution();
        int ans[] = obj.twoSum(arr, target);

        if(ans[0] == -1 && ans[1] == -1)
        {
            System.out.println("Not found");
        }
        else
        {
            System.out.println("Element forund at position " + (arr[0]+1) + " and " + (arr[1]+1));
        }
    }
}



class Solution
{
    public int[] twoSum(int[] nums, int target)
    {
    for(int i=0; i<nums.length; i++)
    {
        for(int j=i+1; j<nums.length; j++)
        {
            int sum = nums[i] + nums[j];
            if(sum == target)
            {
                return new int[] {i,j}; 
            }
        }
    }
    return new int[] {-1,-1};
    }
}