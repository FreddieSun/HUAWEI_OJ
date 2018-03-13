import java.util.*;
public class Bottle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        while(scanner.hasNext()) {
            n = scanner.nextInt();
            System.out.println(drink(n));
        }
    }
    public static int drink(int n) {
        return n/2;
    }

}