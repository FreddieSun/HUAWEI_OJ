import java.util.*;
public class ApproxiateNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            float n = sc.nextFloat();
            System.out.println(approxiateNum(n));
        }
    }

    public static int approxiateNum(float num) {
        float val = (float)(num - Math.floor(num));
        if (val >= 0.5) {
            return (int) Math.floor(num + 1);
        } else {
            return (int) Math.floor(num);
        }
    }

    public static int getReturn(double d) {
        int i=(int)d;
        return  (d-i)>=0.5?i+1:i;
    }
}