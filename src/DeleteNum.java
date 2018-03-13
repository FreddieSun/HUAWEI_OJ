import java.util.*;

public class DeleteNum {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int n=in.nextInt();
            System.out.println(remainingLast(n,3));
        }
    }

    private static int remainingLast(int n,int k) {
        int last=0;
        for(int i=2;i<=n;i++)
            last=(last+k)%i;
        return last;
    }
}