import java.util.*;

public class BiggestSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = sc.nextInt();
        }
        int max = 0;
        for (int i = 0; i < N; i++) {
            int min = nums[i];
            for (int j = i + 1; j < N; j++) {
                min = Math.min(min, nums[j]);
                max = Math.max(max, min * (j - i + 1));
            }
        }
        System.out.println(max);

    }
}