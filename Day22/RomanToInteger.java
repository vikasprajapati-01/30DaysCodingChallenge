import java.util.HashMap;
import java.util.*;

class RomanToInteger
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s;
        System.out.println("Enter the Roman String : ");
        s = sc.nextLine();
        s = s.toUpperCase();

        Solution obj = new Solution();
        int ans = obj.convert(s);

        System.out.println("The integer is " + ans);
    }
}

class Solution {
    public int convert(String s) {
        if(s == null || s.length() == 0)
        {
            return 0;
        }
        int ans = 0;

        HashMap<Character,Integer> mp = new HashMap<>();
        mp.put('I',1);
        mp.put('V',5);
        mp.put('X',10);
        mp.put('L',50);
        mp.put('C',100);
        mp.put('D',500);
        mp.put('M',1000);

        ans = mp.get(s.charAt(s.length()-1));
        for(int i = s.length()-2; i >=0; i--)
        {
            if(mp.get(s.charAt(i)) < mp.get(s.charAt(i+1)))
            {
                ans = ans - mp.get(s.charAt(i));
            }
            else
            {
                ans = ans + mp.get(s.charAt(i));
            }
        }
        return ans;
    }
}