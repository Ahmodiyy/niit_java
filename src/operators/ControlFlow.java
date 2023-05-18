package operators;

import java.util.Scanner;

public class ControlFlow {
    public void ef(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("input number dude ");
        int numOne  = scanner.nextInt();
        if(numOne%2 == 0){
            System.out.println("this is an even number \n Input and odd number");
            int numTwo = scanner.nextInt();
            if(numTwo %2 != 0){
                System.out.println("This is an odd number");
            }
            else System.out.println("This is an even number" );
        }
        else System.out.println("it is an odd number");
    }

    public void switching(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("input number dude ");
        int num = scanner.nextInt();
        switch (num){
            case 1 :
                System.out.println("you input number 1");
                break;
            case 2 :
                System.out.println("You input number 2");
                break;
            default:
                System.out.println("You don't want higher number");
        }
    }

    public void forLoop(){
        for(int num = 0; num<10; num++){
            System.out.println("loop at " + num);
        }
    }
    public void whileLoop(){
        int num = 0;
        while (num < 10){
            System.out.println(num);
            num++;
        }
    }

    public void doWhile(){
        int num = 0;
        do {
            System.out.println(num);
            num++;
        }while (num < 10);
    }

    public static void main(String[] args) {
        ControlFlow controlFlow = new ControlFlow();
        controlFlow.doWhile();
    }
}
