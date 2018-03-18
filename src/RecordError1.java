import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class RecordError1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String,Integer> map = new LinkedHashMap<>();

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] list = line.split("\\s");
            String[] fileDir = list[0].split("\\\\");
            String fileName = fileDir[fileDir.length - 1];
            int row = Integer.parseInt(list[1]);
            String key = fileName + " " +row;

            if (map.containsKey(key)) {
                    map.put(key,map.get(key) + 1 );
            } else {
                map.put(fileName,row);
            }
        }

        int i = 0;
        for (String s:map.keySet()) {
            i++;
            if (i > (map.keySet().size() - 8)) {
                String[] temp = s.split("\\s");
                if (temp[0].length() > 16) {
                    s = temp[0].substring(temp[0].length() - 16) + " " + temp[1];
                }
                System.out.println(s + " " + map.get(s));
            }

        }
    }
}
