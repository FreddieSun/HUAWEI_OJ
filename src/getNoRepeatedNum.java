import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
public class getNoRepeatedNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int num = sc.nextInt();
            HashMap<Integer,Integer> map = new HashMap<>();
            StringBuffer sb = new StringBuffer();
            List<Integer> list = new ArrayList<>();
            while(num != 0) {
                list.add(num%10);
                num /= 10;
            }
            for (int i = 0; i < list.size() ; i++) {
                if (map.containsKey(list.get(i))) {
                    map.put(list.get(i),map.get(list.get(i)) + 1);
                } else {
                    map.put(list.get(i),1);
                }
            }
            for (int i = 0; i < list.size() ; i++) {
                if (map.get(list.get(i)) == 1)
                    sb.append(list.get(i));
                else if (map.get(list.get(i)) >= 1) {
                    map.put(list.get(i),0);
                    sb.append(list.get(i));
                }
            }
            System.out.println(Integer.valueOf(sb.toString()));
        }
    }
}
