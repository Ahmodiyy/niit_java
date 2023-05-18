public class Array {
    int[] oneDimensionalArray = new int[6];
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
        System.out.println(twoDimensionalArray.length);
        for(int row = 0; row<twoDimensionalArray.length; row++){
            for (int column = 0; column<2; column++){
                System.out.println(twoDimensionalArray[row][column]);
            }
        }
    }

    public static void main(String[] args) {
        Array array = new Array();
        array.printTwoDimensionalArray();
    }
}
