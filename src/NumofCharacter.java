import java.util.Scanner;

public class NumofCharacter {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] list = s.split("\\s");
        char dst = list[1].charAt(0);
        String src = list[0];
        int count = 0;
        for (int i = 0; i < src.length(); i++) {
            if (src.charAt(i) == dst)
                count++;
        }
        System.out.println(count);
    }
}
