package generic;

public class Generic<K, T>{
    K a;
    T t;
    public T getT() {
        return t;
    }
    public void setT(T t) {
        this.t = t;
    }
    public K getA() {
        return a;
    }
    public <D> D display(D value){
        return value;
    }
    public void setA(K a) {
        this.a = a;
    }

    public static void main(String[] args) {
        Generic<Integer, Double> genericInt = new Generic<>();
        genericInt.setA(5);
        Generic<String, Float> genericString = new Generic<>();
        genericString.setA("walking poetry");
        System.out.println(genericInt.getA());
        System.out.println(genericString.getA());
        System.out.println("\n\n");
        System.out.println(genericInt.display("I'm greater"));
        System.out.println(genericInt.display(6));
        System.out.println(genericInt.display(7.7));
    }
}