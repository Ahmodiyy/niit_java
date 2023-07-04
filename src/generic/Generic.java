package generic;

public class Generic<K>{
    K a;

    public K getA() {
        return a;
    }

    public void setA(K a) {
        this.a = a;
    }

    public static void main(String[] args) {
        Generic generic = new Generic();
        generic.setA(5.9);
        System.out.println(generic.getA());
    }
}