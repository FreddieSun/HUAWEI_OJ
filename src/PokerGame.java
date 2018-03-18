import java.util.Scanner;

public class PokerGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            String[] list = s.split("-");

            String card1 = list[0];
            String card2 = list[1];
            //首先判断是否合法
            // 通过牌数量来比较 除去有炸弹和王炸的情况
            String[] cards1 = card1.split("\\s");
            String[] cards2 = card2.split("\\s");
            if (cards1.length != cards2.length) {
                if (!(cards1.length == 4 || cards2.length == 4 ||
                        card1.contains("JOKER")||card2.contains("JOKER"))) {
                    System.out.println("ERROR");
                    continue;
                }
            }

            // 现在已合法，判断大小
            // 注意比较的顺序，需要重写compare

            // 如果两边相等并且没有王炸
            if ((cards1.length == cards2.length) && !(card1.contains("JOKER") || card2.contains("JOKER"))) {
                String compare = "345678910JQKA2jokerJOKER";
                if (compare.indexOf(cards1[0]) < compare.indexOf(cards2[0]))
                    System.out.println(card2);
                else
                    System.out.println(card1);

                continue;
            }

            // 如果有王炸
            if (card1.contains("JOKER") || card2.contains("JOKER")) {
                if (card1.contains("JOKER")) {
                    System.out.println(card1);
                } else {
                    System.out.println(card2);
                }
                continue;
            }


            //如果有炸弹
            if (cards1.length == 4 || cards2.length == 4)  {
                if (cards1.length == 4)
                    System.out.println(card1);
                else
                    System.out.println(card2);
            }
        }
    }

    public static void compare(String[] a, String[] b) {



    }
}
