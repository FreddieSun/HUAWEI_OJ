import java.util.*;
public class ChangeToSixteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            String s = sc.next();
            String value = s.substring(2,s.length());
            char[] c = value.toCharArray();
            int res = 0;
            for (int i = 0; i < c.length; i++) {
                if(Character.isDigit(c[i]))
                    res += Character.getNumericValue(c[i])*Math.pow(16,c.length-i-1);
                else
                    res += (c[i] - 'A' + 10)*Math.pow(16,c.length-i-1);
            }
            System.out.println(res);
        }

    }
}