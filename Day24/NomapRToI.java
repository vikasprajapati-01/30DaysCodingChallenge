import java.util.*;

class NomapRToI
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s;
        System.out.println("Enter the Roman Letter ");
        s = sc.nextLine();
        s = s.toUpperCase();
        char ch[] = s.toCharArray();
        int len = s.length();
        int ans = 0;
        
        for(int i = s.length()-1; i > -1; i--)
        {
            if(i-1 > -1 && ch[i] == 'V' && ch[i-1] == 'I')
            {
                ans = ans + 4;
                i--;
                continue;
            }
            else if(i-1 > -1 && ch[i] == 'X' && ch[i-1] == 'I')
            {
                ans = ans + 9;
                i--;
                continue;
            }
            else if(i-1 > -1 && ch[i] == 'L' && ch[i-1] == 'X')
            {
                ans = ans + 40;
                i--;
                continue;
            }
            else if(i-1 > -1 && ch[i] == 'C' && ch[i-1] == 'X')
            {
                ans = ans + 90;
                i--;
                continue;
            }
            else if(i-1 > -1 && ch[i] == 'D' && ch[i-1] == 'C')
            {
                ans = ans + 400;
                i--;
                continue;
            }
            else if(i-1 > -1 && ch[i] == 'M' && ch[i-1] == 'C')
            {
                ans = ans + 900;
                i--;
                continue;
            }
        
            if(i > -1)
            {
                if(ch[i] == 'I')
                {
                ans = ans + 1;
                }
                else if(ch[i] == 'V')
                {
                ans = ans + 5;
                }
                else if(ch[i] == 'X')
                {
                ans = ans + 10;
                }
                else if(ch[i] == 'L')
                {
                ans = ans + 50;
                }
                else if(ch[i] == 'C')
                {
                ans = ans + 100;
                }
                else if(ch[i] == 'D')
                {
                ans = ans + 500;
                }
                else if(ch[i] == 'M')
                {
                ans = ans + 1000;
                }
            }
        }
        System.out.println("The Integer is " + ans);
    }
}