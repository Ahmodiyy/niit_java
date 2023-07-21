package io;

import java.io.*;
import java.util.Arrays;

public class IO {
    static void inputSteaming() {
        int i;
        char c;
        try (FileInputStream f =
                     new FileInputStream("C:\\Users\\Ahmod\\Documents\\io\\us.txt")) {
            while ((i = f.read()) != -1) {
                c = (char) i;
                System.out.print(c);

            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    static void bufferedInputSteaming() throws FileNotFoundException {
        int i;
        char c;
        String str = "walking poetry";

        try (BufferedInputStream f =
                     new BufferedInputStream(new FileInputStream("C:\\Users\\Ahmod\\Documents\\io\\us.txt"))) {
            // read all bytes at once
            byte[] b = f.readAllBytes();

            //looping the bytes to convert each byte to character
            for (byte bite : b) {
                System.out.print((char) bite);
            }

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    static void fileReading() {
        try (FileReader f = new FileReader("C:\\Users\\Ahmod\\Documents\\io\\us.txt")) {
            char[] a = new char[50];
            f.read(a);
            for (char c : a) {
                System.out.print(c);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        //IO.inputSteaming();
        //IO.bufferedInputSteaming();
        IO.fileReading();
    }
}