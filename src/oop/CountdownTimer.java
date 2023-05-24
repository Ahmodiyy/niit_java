package oop;
import java.time.Duration;
import java.time.Instant;

public class CountdownTimer {
    public static void main(String[] args) {
        Instant start = Instant.now();
        System.out.println(start.toString());
        Instant end = start.plus(Duration.ofMinutes(5));
        while (true) {
            Instant now = Instant.now();
            Duration remaining = Duration.between(now, end);
            if (remaining.isNegative()) {
                break;
            }
            System.out.println("Time remaining: " + remaining.getSeconds() + " seconds");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

