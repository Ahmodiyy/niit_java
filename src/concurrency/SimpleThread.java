package concurrency;


class MainThreadDemo
{
    public static void main(String[] args) throws InterruptedException {
        Thread t= Thread.currentThread();
        System.out.println(" The current thread: " + t);
        t.setName("MainThread");
        System.out.println(" The current thread after name change : "
                + t);
        System.out.println(" The current Thread is going to sleep for 10 seconds");
            t.sleep(10000);
        System.out.println(" After 10 seconds...........the current Thread is exiting now.");
    }
}


