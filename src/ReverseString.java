import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s = sc.next();
            StringBuffer sb = new StringBuffer(s);
            System.out.println(sb.reverse().toString());
        }
    }
}
