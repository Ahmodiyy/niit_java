import packages.MyName;

public class Greet extends MyName{
    int greetingId;
    float greetingRatio = 2.4f;
    char greetingMessage = 'f';
    String longGreeting = "welcome";

    public Greet(int greetingId) {
        this.greetingId = greetingId;
    }

    public void greet(){
        //return 5;
    }

    public String notGreet(){
        return "i don't want to greet";
    }
    public static void main(String[] args) {
        MyName myName =  new MyName();
        Greet greet = new Greet(1);

        System.out.println(greet.name);
    }
}
