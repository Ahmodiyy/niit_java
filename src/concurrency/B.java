package concurrency;

public class B extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("loop :" + i);
                Thread.sleep(100);
            }
        } catch (InterruptedException obj) {
            System.out.println("Thread :"  + "interrupted");
        }
    }

    public static void main(String[] args) {

    }
}
