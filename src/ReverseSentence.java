import java.util.Scanner;

public class ReverseSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            String res = reverse(s);
            System.out.println(res);
        }
    }
    public static String reverse(String sentence) {
        String[] res = sentence.trim().split("\\s+");
        StringBuffer sb = new StringBuffer();
        for(int i = res.length - 1; i >= 0; i--) {
            sb.append(res[i] + " ");
        }
        return sb.toString().trim();
    }
}
