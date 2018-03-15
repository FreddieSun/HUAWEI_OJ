import java.util.Scanner;

public class DeleteMinChar {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s = sc.next();
            int[] words = new int[26];
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                words[c - 'a']++;
            }
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < 26; i++) {
                if (words[i] != 0 && words[i] <= min)
                    min = words[i];
            }
            for (int i = 0; i < 26; i++) {
                if (words[i] == min)
                    words[i] = 0;
            }
            StringBuffer sb = new StringBuffer();
            // 输出结果
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (words[c - 'a'] != 0)
                    sb.append(c);
            }
            System.out.println(sb.toString());
        }
    }
}
