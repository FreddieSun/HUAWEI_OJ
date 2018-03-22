import java.util.*;

public class DAFUWENG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        helper(N, list);
        System.out.println(list.size());
    }

    public static void helper(int N, List<Integer> list) {
        if (N < 0)
            return;
        if (N == 0)
            list.add(1);
        helper(N - 1, list);
        helper(N - 2, list);
        helper(N - 3, list);
        helper(N - 4, list);
        helper(N - 5, list);
        helper(N - 6,list);
    }
}