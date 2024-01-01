import java.util.*;

class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s1,s2;
        System.out.println("Enter the main Word : ");
        s1 = sc.nextLine();
        System.out.println("Enter the word to be found : ");
        s2 = sc.nextLine();

        Solution obj = new Solution();
        int ans = obj.strStr(s1,s2);

        if(ans != -1)
        {
        System.out.println("Found at index " + (ans+1));
        }
        else
        {
            System.out.println("Not found");
        }
    }
}

class Solution {
    public boolean compare(String s1,String s2, int index)
    {
        int l1 = s1.length();
        int l2 = s2.length();
        for(int i = 0; i < l2; i++)
        {
            if(index >= l1)
            {
                return false;
            }
            if(s1.charAt(index++) != s2.charAt(i))
            {
                return false;
            }
        }
        return true;
    }
    public int strStr(String s1, String s2) {
        int l = s1.length();

        for(int i = 0; i < l; i++)
        {
            if(s1.charAt(i) == s2.charAt(0))
            {
                if(compare(s1,s2,i) == true)
                {
                    return i;
                }
            }
        }
        return -1;
    }
}