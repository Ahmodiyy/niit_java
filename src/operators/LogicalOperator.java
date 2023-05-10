package operators;

public class LogicalOperator {
    int a;
    int b;
    public LogicalOperator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    private void logicalAnd(){
        if(a==2 && b==2){
            System.out.println("both conditions are true");
        }
    }
    private void logicalOr(){
        if(a==2 || b==2){
            System.out.println("one conditions are true");
        }
    }
    public static void main(String[] args) {
        
    }
}
