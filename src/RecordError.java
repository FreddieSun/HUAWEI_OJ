import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class RecordError {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String,Integer> map = new LinkedHashMap<>();
        while (sc.hasNext()) {
            String s = sc.next();
            String[] val = s.split("\\\\");
            int N = sc.nextInt();
            String fileName = val[val.length - 1];
            if (fileName.length() > 16)
                fileName=fileName.substring(fileName.length()-16);
            String key = fileName + " " + N;
            if (map.containsKey(key))
                map.put(key,map.get(key) + 1);
            else
                map.put(key , 1);

        }
        int i = 0;
        for (String s:map.keySet()) {
            i++;
            if (i > (map.keySet().size() - 8))
                System.out.println(s + " " + map.get(s));
        }
    }
}
