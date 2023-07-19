package concurrency;

class Example {
    private int count = 0;

    public synchronized void increment() {
        count++;
        System.out.println(Thread.currentThread() + " " + count);
    }

    public static void main(String[] args) {
        Example example = new Example();

        // Create multiple threads incrementing the count
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                example.increment();
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                example.increment();
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Count: " + example.count); // Output may vary
    }
}