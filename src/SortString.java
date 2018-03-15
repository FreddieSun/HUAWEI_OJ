import java.util.Scanner;

public class SortString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < 26; i++) {
                char c = (char) (i + 'A');
                for (int j = 0; j < s.length(); j++) {
                    if (s.charAt(j) == c || c == s.charAt(j) - 32) {
                        sb.append(s.charAt(j));
                    }
                }
            }

            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (!(('A'<=c&&'Z'>=c)||('a'<=c&&'z'>=c))) {
                    sb.insert(i,c);
                }
            }
            System.out.println(sb.toString());
        }
    }
}
