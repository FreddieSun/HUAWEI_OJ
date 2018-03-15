import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CalculateCoordinate {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] list = s.split(";");
        for (String val : list) {
            try {
                int digit = Integer.parseInt(val.substring(1));
                char c = val.charAt(0);
                if (c == 'W') {
                    y += digit;
                } else if (c == 'S') {
                    y -= digit;
                } else if (c == 'A') {
                    x -= digit;
                } else if (c == 'D') {
                    x += digit;
                }
            } catch (Exception e) {
                continue;
            }
        }

        System.out.println(x+","+y);
    }
}
