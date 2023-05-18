package operators;

public class TernaryOperator {
    public int isGreater(int operandOne, int operandTwo){
        return operandOne > operandTwo ? 1 : 0;
    }
    public int compareName(String nameOne, String nameTwo){
        return nameOne.equals(nameTwo) ? 1 : 0;
    }

    public static void main(String[] args) {
        TernaryOperator ternaryOperator = new TernaryOperator();
        System.out.println(ternaryOperator.isGreater(20, 53));
    }
}
