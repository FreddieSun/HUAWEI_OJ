import java.util.Scanner;

public class HIghestScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int N =sc.nextInt();
            int M = sc.nextInt();
            int[] nums = new int[N];
            for (int i = 0; i < N; i++) {
                nums[i] = sc.nextInt();
            }
            for (int i = 0; i < M; i++) {
                String s = sc.next();
                int left = sc.nextInt();
                int right = sc.nextInt();
                if (s.equals("Q")) {
                    System.out.println(getHighestScore(nums,left - 1,right - 1));
                } else {
                    nums[left - 1] = right;
                }
            }
        }
    }
    public static int getHighestScore(int[] nums, int left, int right) {
        int max = nums[left];
        if (left > right)
            return getHighestScore(nums, right, left);
        else {
            for (int i = left; i <= right; i++) {
                if (nums[i] > max)
                    max = nums[i];
            }
        }
        return max;
    }
}
