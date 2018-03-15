import java.util.Scanner;

public class IsValid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s = sc.nextLine();
            boolean hasDigit = false;
            boolean hasUpper = false;
            boolean hasLower = false;
            boolean hasOther = false;
            boolean noContinues = true;
            if (s.length() <= 8) {
                System.out.println("NG");
                continue;
            }
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (Character.isDigit(c))
                    hasDigit = true;
                else if (Character.isUpperCase(c))
                    hasUpper = true;
                else if (Character.isLowerCase(c))
                    hasLower = true;
                else
                    hasOther = true;
            }
            for (int i = 0; i < s.length() - 3; i++) {
                String val = s.substring(i,i + 3);
                if (s.substring(i+3).contains(val))
                    noContinues = false;
            }
            if (noContinues&&((hasDigit && hasUpper && hasLower) || (hasDigit && hasUpper && hasOther) || (hasDigit && hasLower && hasOther)
                    || (hasUpper && hasLower && hasOther))) {
                System.out.println("OK");
            } else {
                System.out.println("NG");
            }
        }
    }
}
