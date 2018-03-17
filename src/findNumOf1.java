import java.util.Scanner;

public class findNumOf1 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
        int count = 0;
        while (val != 0) {
            count++;
            val &= (val - 1);
        }
        System.out.println(count);
    }
}
