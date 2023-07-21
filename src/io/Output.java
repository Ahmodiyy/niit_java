package io;

import java.io.*;

public class Output {
    static void outStreaming() {
        String s = "This is a FileOutputStream Program";
        byte[] buf = s.getBytes();
        try (BufferedOutputStream fos = new BufferedOutputStream(new FileOutputStream("C:\\Users\\Ahmod\\Documents\\io\\su.txt"));
        ) {
            for (int i = 0; i < buf.length; i++) {
                fos.write(buf[i]);
            }        } catch (Exception e) {
            System.out.println(e);
        }

    }
    static  void bufferStreaming(){
        try (BufferedWriter b = new BufferedWriter(new OutputStreamWriter(System.out)))
        {
            String fruit[] = {"Apple", "Banana", "Grapes"};
            b.write("Different types of fruit are:" + "\n");
            for (int i = 0; i< 3; i++)
            {
                b.write(fruit[i] + "\n");
                b.flush();
            }
        }
        catch (IOException e)
        {
            System.out.println(e);
        }

    }
    public static void main(String[] args) {
        //Output.outStreaming();
        Output.bufferStreaming();
    }
}
