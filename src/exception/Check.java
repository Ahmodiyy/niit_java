package exception;

import javax.imageio.IIOException;
import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Check {
    static int preformCalculation(){
        Scanner scanner = new Scanner(System.in);
        int numOne = 0;
        int numTwo = 0;
        int age = 0;
        try {
            System.out.println("input num one");
            numOne = scanner.nextInt();
            System.out.println("input num two");
            numTwo = scanner.nextInt();
            System.out.println("input age");
            age = scanner.nextInt();
            if(age < 18){
                throw new RuntimeException();
            }

        } catch (Exception mismatchException){
            mismatchException.printStackTrace();
        }
        finally {

        }

        return add(numOne, numTwo);
    }

    static int add(int numOne, int numTwo){
        return numOne + numTwo;
    }
    public static void main(String[] args) throws IOException {
        //System.out.println( preformCalculation());
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader("C:\\Users\\Ahmod\\Documents\\input.txt"));
            System.out.println( bufferedReader.readLine());
        }
        catch (IOException ioException){
        }
        finally {
            assert bufferedReader != null;
            bufferedReader.close();
        }

        try(BufferedReader bufferedReaders = new BufferedReader(new FileReader("C:\\Users\\Ahmod\\Documents\\input.txt"))){
            System.out.println( bufferedReaders.readLine());
        }
        catch (IOException ioException){
        }

    }
}
