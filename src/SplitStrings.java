import java.util.Scanner;

public class SplitStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s = sc.next();
            int N = sc.nextInt();
            int index = N;
            for (int i = 0; i < N; i++) {
                char c = s.charAt(i);
                if (c > 256) {
                    if (i != N-1) {
                        index --;
                    }
                } else {

                }
            }
            System.out.println(s.substring(0,index));
        }


    }
}
