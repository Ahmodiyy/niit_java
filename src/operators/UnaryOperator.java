package operators;

public class UnaryOperator {
    public int postIncrement(int value){
        return value++;
    }
    public int postDecrement(int value){
        return value--;
    }
    public int preIncrement(int value){
        return ++value;
    }
    public int preDecrement(int value){
        return --value;
    }
    public static void main(String[] args) {
        UnaryOperator unaryOperator = new UnaryOperator();
        System.out.println( unaryOperator.preIncrement(1));
        System.out.println(unaryOperator.preDecrement(2));
        System.out.println( unaryOperator.postIncrement(3));
        System.out.println(unaryOperator.postDecrement(4));
    }
}
