import java.util.Scanner;

public class MyThread implements Runnable {
    private String tName;
    private Object tPrev;
    private Object tSelf;
    private int tCount;

    public MyThread(String name, Object prev, Object self, int count) {
        tName = name;
        tPrev = prev;
        tSelf = self;
        tCount = count;
    }

    @Override
    public void run() {
        while (tCount > 0) {
            synchronized (tPrev) {
                synchronized (tSelf) {
                    System.out.print(tName);
                    tCount--;
                    tSelf.notify();
                }
                try {
                    tPrev.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }


    public static void main(String[] args) throws InterruptedException {
        Object A = new Object();
        Object B = new Object();
        Object C = new Object();
        Object D = new Object();

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        MyThread ta = new MyThread("A", D, A, N);
        MyThread tb = new MyThread("B", A, B, N);
        MyThread tc = new MyThread("C", B, C, N);
        MyThread td = new MyThread("D", C, D, N);

        Thread a = new Thread(ta);
        a.start();
        Thread.sleep(100);
        Thread b = new Thread(tb);
        b.start();
        Thread.sleep(100);
        Thread c = new Thread(tc);
        c.start();
        Thread.sleep(100);
        Thread d = new Thread(td);
        d.start();
        Thread.sleep(100);


    }
}
