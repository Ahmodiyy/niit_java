package concurrency;

public class C extends Thread{
    @Override
    public void run() {

    }
    public static void main(String[] args) {
        C c = new C();
        c.start();
    }

}
