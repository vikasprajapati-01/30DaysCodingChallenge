import java.util.*;
import java.util.HashMap;
import java.util.LinkedHashMap;

class IntToRoman
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter a Integer");
        num = sc.nextInt();

        Solution obj = new Solution();
        String ans = obj.convert(num);
        System.out.println(ans);
    }
}

class Solution {
    public String convert(int num) {
        HashMap<String,Integer> mp = new LinkedHashMap();
        mp.put("M",1000);
        mp.put("CM",900);
        mp.put("D",500);
        mp.put("CD",400);
        mp.put("C",100);
        mp.put("XC",90);
        mp.put("L",50);
        mp.put("XL",40);
        mp.put("X",10);
        mp.put("IX",9);
        mp.put("V",5);
        mp.put("IV",4);
        mp.put("I",1);

        StringBuilder str = new StringBuilder();

        for(HashMap.Entry<String,Integer> i : mp.entrySet() )
        {
            while(num >= i.getValue())
            {
                num = num - i.getValue();
                str.append(i.getKey());
            }
        }
        return str.toString();
    }
}