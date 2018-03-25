import java.util.Scanner;

public class snakeMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int N = sc.nextInt();
            GetResult(N);
        }
    }

    public static void GetResult (int N) {
        StringBuilder builder = new StringBuilder();
        for (int i = 1; i <= N; i++) {
            // 每一行的第一个元素是(i-1)*i/2+1
            // 每一行的元素个数是n-i
            // 初始间隔是i+1，之后每一个间隔比上一个间隔多1，之后的每个元素是前一个元素加上间隔
            for (int j = 1, start = (i - 1) * i / 2 + 1, step = i + 1; j <= N - i + 1; j++, start += step, step++) {
                builder.append(start).append(' ');
            }

            // 设置换行符
            builder.setCharAt(builder.length()-1, '\n');

        }
        System.out.println(builder.toString());
    }
}
