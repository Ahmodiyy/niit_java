package concurrency;

public class MultiThread implements Runnable{
    static int count = 0;
    @Override
    public void run() {
        System.out.println(++count);
    }
    public static void main(String[] args) {
        MultiThread multiThread = new MultiThread();
        Thread t1  = new Thread(multiThread);
        Thread t2  = new Thread(multiThread);
        t1.start();
        t2.start();
    }
}
