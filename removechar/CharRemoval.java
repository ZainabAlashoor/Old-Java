package old.removechar;
import java.util.Scanner;

public class CharRemoval {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        try {
            System.out.print("Type a string: ");
            String str = in.nextLine();

            System.out.print("Enter a letter to delete: ");
            char ch = in.nextLine().charAt(0);
            String ss;
            ss = charDelete(str, ch);
            System.out.println("the string after deleting is: " + ss);
        } finally {
            in.close();
        }

    }

    public static String charDelete(String s1, char ch) {
        String s2 = " ";
        for (int i = 0; i < s1.length(); i++)
            if (s1.charAt(i) != ch)
                s2 += s1.charAt(i);
        return s2;
    }

}
