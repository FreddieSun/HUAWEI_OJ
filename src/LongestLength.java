import java.util.*;

public class LongestLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int N = sc.nextInt();
            List<String> list = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                list.add(sc.next());
            }
            Collections.sort(list);
            for (int i = 0; i < N;i++) {
                System.out.println(list.get(i));
            }
        }
    }
}
