import java.util.Scanner;

public class NumofOne {
    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        while (N > 0) {
            if ( (N & 1) == 1)
                count++;
            N >>= 1;
        }
        System.out.println(count);
    }

    public static void main1(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        while (N != 0) {
            count++;
            N &= (N - 1);
        }
        System.out.println(count);
    }
}
