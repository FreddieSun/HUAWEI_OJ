import java.util.Scanner;

public class LongestPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s = sc.next();
            char[] c = s.toCharArray();

            int max = helper(c);
            System.out.println(max);
        }
    }

    public static int helper (char[] c) {
        int max = 0;
        // 奇数
        for (int i = 0; i < c.length; i++) {
            int j = 1;
            while ((i - j >= 0 && i + j < c.length) && c[i - j] == c[i + j]) {
                max = Math.max(max, 2 * j + 1);
                j++;
            }
        }

        for (int i = 0; i < c.length; i++) {
            int left = i;
            int right = i + 1;
            while ((left >= 0 && right < c.length) && c[left] == c[right]) {
                max = Math.max(max, right - left + 1);
                left--;
                right++;
            }
        }

        // 偶数
        return max;
    }
}
