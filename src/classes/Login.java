package classes;

public class Login {
    class Validate{

    }
    static class StaticValidate{

    }

    void baci(){
        System.out.println("baci");
        class HildaBaci{
            void cook(){
                System.out.println("96 hour straight cooking");
            }
        }
        HildaBaci hildaBaci = new HildaBaci();
        hildaBaci.cook();
    }

    public static void main(String[] args) {
        Login login = new Login();
        Validate validate = login.new Validate();
        StaticValidate staticValidate = new StaticValidate();
        login.baci();
    }
}
