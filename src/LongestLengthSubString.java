import java.util.*;

public class LongestLengthSubString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        System.out.println(helper(a, b));
    }

    public static int helper(String a, String b) {
        if (a.length() > b.length())
            return helper(b, a);
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < b.length(); i++) {
            for (int j = i + 1; j < b.length(); j++) {
                if (a.contains(b.substring(i, j + 1)))
                    list.add(j - i + 1);
            }
        }

        if (list.size() == 0) {
            for (int i = 0; i < b.length(); i++) {
                if (a.contains(b.charAt(i) + ""))
                    return 1;
            }
            return 0;
        }

        return Collections.max(list);
    }
}