package operators;

public class BitwiseOperator {
    protected int bitAnd(int a, int b){
        return a & b;
    }
    protected int bitOr(int a, int b){
        return a | b;
    }
    protected int bitXor(int a, int b){
        return a ^ b;
    }
    protected int bitNot(int a){
        return ~a;
    }
    public static void main(String[] args) {
        BitwiseOperator bitwiseOperator = new BitwiseOperator();
        System.out.println( bitwiseOperator.bitAnd(2,3));
        System.out.println( bitwiseOperator.bitOr(2,3));
        System.out.println( bitwiseOperator.bitXor(2,3));
        System.out.println(  bitwiseOperator.bitNot(-3));
    }
}
