import java.util.Scanner;

public class RotateTheNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String a = sc.next();
            String b = sc.next();
            StringBuffer sb = new StringBuffer(a);
            String a1 = sb.reverse().toString();
            StringBuffer sb1 = new StringBuffer(b);
            String b1 = sb1.reverse().toString();
            int a2 = Integer.parseInt(a1);
            int b2 = Integer.parseInt(b1);
            int res = a2 + b2;
            System.out.println(res);

        }
    }
}
