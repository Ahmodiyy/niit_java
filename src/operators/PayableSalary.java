package operators;

import java.util.Scanner;

public class PayableSalary {
    double fiftyPercentSalary, seventyFivePercentSalary, twelvePercentSalary;

    public void calculatePayableSalary(){
        System.out.println("Input basic salary");
        Scanner scanner = new Scanner(System.in);
        double basicSalary  = scanner.nextDouble();
        double fiftyPercent = 50.0/100.0;
        fiftyPercentSalary = fiftyPercent * basicSalary;
        System.out.println("Fifty percent payable salary \t" + fiftyPercentSalary);
    }
    public static void main(String[] args) {
        PayableSalary payableSalary = new PayableSalary();
        payableSalary.calculatePayableSalary();
    }
}
