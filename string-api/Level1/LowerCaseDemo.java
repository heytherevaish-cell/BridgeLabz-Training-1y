import java.util.Scanner;

public class LowerCaseDemo {

    public static String toLower(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z')
                ch = (char) (ch + 32);
            result += ch;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String lower1 = toLower(text);
        String lower2 = text.toLowerCase();

        System.out.println("Using ASCII: " + lower1);
        System.out.println("Using built-in: " + lower2);
        System.out.println("Are equal? " + lower1.equals(lower2));
    }
}
