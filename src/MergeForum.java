import java.util.*;

public class MergeForum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer,Integer> map = new HashMap<>();
        while(sc.hasNext()) {
            int N = sc.nextInt();
            for (int i = 0; i < N; i++) {
                int key = sc.nextInt();
                int val = sc.nextInt();
                if (map.containsKey(key)) {
                    map.put(key,map.get(key) + val);
                } else {
                    map.put(key,val);
                }
            }
        }

        // 排序HashMap
        List<Map.Entry<Integer,Integer>> list = new ArrayList<Map.Entry<Integer,Integer>>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o1.getKey().compareTo(o2.getKey());
            }
        });
        for(Map.Entry<Integer,Integer> mapping:list){
            System.out.println(mapping.getKey()+" "+mapping.getValue());
        }
    }

    public static void main1(String[] args) {

    }
}
