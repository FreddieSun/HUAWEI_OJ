import java.util.*;
public class StringCollection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s = sc.next();
            StringBuffer sb = new StringBuffer();
            for (int i = 0;i < s.length(); i++) {
                char c = s.charAt(i);
                int index = s.indexOf(c+"");
                if (index == i) {
                    sb.append(c);
                }
            }
            System.out.println(sb.toString());
        }
    }
}