
import java.util.*;

class ReverseInteger
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the Integer : ");
        n = sc.nextInt();

        Solution obj = new Solution();
        int ans = obj.reverse(n);

        System.out.println("The reversed Integer is : " + ans);
    }
}




class Solution {
    public int reverse(int x) {
        int ans = 0;
        while(x != 0) {
            int rem = x % 10;
            x = x / 10;
            
        if( ans > 0 && ans > (Integer.MAX_VALUE - rem) / 10 || ans < 0 && ans < (Integer.MIN_VALUE - rem) / 10) {
            return 0;
        }
            ans = ans * 10 + rem;
        }

        return ans;
    }
}