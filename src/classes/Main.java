package classes;

public class Main {
    public static void main(String[] args) {
        Parent parentChild = new Child(); // Upcasting
        parentChild = new Cousin(); // Upcasting
        parentChild.display();
        Cousin child = (Cousin) parentChild; //Downcasting
    }
}
