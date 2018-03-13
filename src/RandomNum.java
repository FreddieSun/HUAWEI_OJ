import java.util.*;
public class RandomNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        while(sc.hasNext()) {
            n = sc.nextInt();
            int[] nums= new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }
            Arrays.sort(nums);
            for (int i = 0; i < nums.length; i++) {
                while(i!= nums.length - 1 && nums[i] == nums[i+1])
                    i++;
                System.out.println(nums[i]);
            }
        }

    }
}