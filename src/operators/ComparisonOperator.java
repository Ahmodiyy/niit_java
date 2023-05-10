package operators;

public class ComparisonOperator {
    int a = 19;
    int b = 3;
    public void greaterThan(){
        if(a>b){
            System.out.println("a is greaterThan b");
        }

    }
    public void LessThan(){
        if(a<b){
            System.out.println("a is lessThan b");
        }
    }
    public void greaterThanOrEqualTo(){
        if(a>=b){
            System.out.println("a is greaterThanOrEqualTo b");
        }
    }
    public void lessThanOrEqualTo(){
        if(a<=b){
            System.out.println("a is lessThanOrEqualTo b");
        }
    }

    public void not() {
        if(a!=b){
            System.out.println("a is not equal to b");
        }
    }
    public void equal() {
        if(a==b){
            System.out.println("a is equal to b");
        }
    }

    public static void main(String[] args) {
        ComparisonOperator comparisonOperator = new ComparisonOperator();
        comparisonOperator.greaterThan();
        comparisonOperator.LessThan();
        comparisonOperator.greaterThanOrEqualTo();
        comparisonOperator.lessThanOrEqualTo();
        comparisonOperator.not();
        comparisonOperator.equal();

    }
}
