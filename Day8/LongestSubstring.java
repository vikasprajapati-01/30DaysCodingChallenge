
import java.util.*;

class LongestSubstring
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s ;
        System.out.println("Enter the string : ");
        s = sc.nextLine();
        Solution obj = new Solution();
        int ans = obj.lengthOfLongestSubstring(s);
        System.out.println("The length of the longest substring in " + s + " is " + ans);
    }
}


class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int p1=0 , p2=0;
        int len = s.length();
        int count = 0;
        while(p2 < len)
        {
            if(map.containsKey(s.charAt(p2)))
            {
               p1 = Math.max(map.get(s.charAt(p2)) + 1, p1);
            }
            map.put(s.charAt(p2),p2);
            count = Math.max(count, p2-p1+1);
            p2++;
        }
        return count;
    }
}