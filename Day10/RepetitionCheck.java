import java.util.*;

public class RepetitionCheck
{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of strings: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] stringArray = new String[n];

        // Input strings from the user

        for (int i = 0; i < n; i++) {
            System.out.println("Enter string " + (i + 1));
            stringArray[i] = sc.nextLine();
        }

        boolean repetitionFound = false;

        // Check for repetitions
        for (int i = 0; i < n - 1; i++)
        {
            for (int j = i + 1; j < n; j++)
            {
                if (stringArray[i].equals(stringArray[j]))
                {
                    repetitionFound = true;
                    break;
                }
            }
            if (repetitionFound)
            {
                break;
            }
        }

        // Print the result
        if (repetitionFound)
        {
            System.out.println("At least one string is repeated.");
        }
        else
        {
            System.out.println("No repetition found.");
        }
    }
}