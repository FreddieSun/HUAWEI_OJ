import java.util.Scanner;

public class ReverseInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int N = sc.nextInt();
            StringBuffer sb = new StringBuffer();
            while(N != 0) {
                sb.append(N % 10);
                N /= 10;
            }
            System.out.println(sb.toString());
        }
    }
}
