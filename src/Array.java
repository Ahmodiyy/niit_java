import java.util.Arrays;

public class Array {
    int[] arr = new int[3];
    int[] oneDimensionalArray = new int[]{5,6};
    int[][] twoDimensionalArray = new int[][]{
            {94859,84989},
            {399439, 94949},
            {399439, 94949},
    };

    void printOneDimensionalArray(){
        oneDimensionalArray[0] = 2;
        oneDimensionalArray[1] = 2;

        for (int i : oneDimensionalArray) {
            System.out.println(i);
        }
    }
    void printTwoDimensionalArray(){
        for (int[] a : twoDimensionalArray) {
            System.out.println("Outer for-each loop " + Arrays.toString(a));
            for (int b: a) {
                System.out.println("column value " + b);
            }

        }
//        for(int row = 0; row<twoDimensionalArray.length; row++){
//            for (int column = 0; column<2; column++){
//                System.out.println(twoDimensionalArray[row][column]);
//            }
//        }
    }

    public static void main(String[] args) {
        Array array = new Array();
        array.printOneDimensionalArray();
        //array.printTwoDimensionalArray();
    }
}
