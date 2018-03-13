import java.util.*;
public class PrimeFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            long n = sc.nextLong();
            String s = getResult(n);
            System.out.println(s);
        }
    }
    public static String getResult(long ulDataInput) {
        StringBuffer sb = new StringBuffer();
        if (ulDataInput == 0 || ulDataInput == 1)
            return sb.toString();
        if(isPrime(ulDataInput)) {
            //sb.append(1 + " ");
            sb.append(ulDataInput + " ");
            return sb.toString();
        } else {
            while(ulDataInput != 1) {
                for (int i = 2; i <= ulDataInput; i++) {
                    if (isPrime(i) && ulDataInput % i == 0) {
                        ulDataInput /= i;
                        sb.append(i + " ");
                        break;
                    }
                }
            }

        }
        return sb.toString();
    }

    public static boolean isPrime(long a) {
        boolean flag = true;
        if (a < 2) {// 素数不小于2  
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(a); i++) {
                if (a % i == 0) {// 若能被整除，则说明不是素数，返回false  
                    flag = false;
                    break;// 跳出循环  
                }
            }
        }
        return flag;
    }
}