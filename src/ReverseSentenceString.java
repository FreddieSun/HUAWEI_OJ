import java.util.*;
public class ReverseSentenceString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            int i = 0;
            int j = s.length() - 1;
            char[] ch = s.toCharArray();
            while (i < j) {
                char temp = ch[i];
                ch[i] = ch[j];
                ch[j] = temp;
                i++;
                j--;
            }
            System.out.println(new String(ch));
        }
    }
}