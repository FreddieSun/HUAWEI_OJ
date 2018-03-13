import java.util.HashSet;
import java.util.Scanner;

public class NumofChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s = sc.next();
            HashSet<Character> set = new HashSet<>();
            for (int i = 0; i < s.length(); i++) {
                if ((int)s.charAt(i) <= 127 && (int)s.charAt(i) >= 0)
                    set.add(s.charAt(i));
            }
            System.out.println(set.size());
        }
    }
}
