package concurrency;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;

public class CountdownTimer implements Runnable {
    public void run()
    {
    }
    public static void main(String[] args) {
        CountdownTimer obj = new CountdownTimer();
        B b = new B();
        Thread CountdownThread = new Thread(b);        //Initialize thread
        CountdownThread.start();
    }
}


