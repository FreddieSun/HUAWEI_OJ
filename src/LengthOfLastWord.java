import java.util.Scanner;

public class LengthOfLastWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] list = s.split("\\s");
        String last = list[list.length - 1];
        System.out.println(last.length());
    }
}
