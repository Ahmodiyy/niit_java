public class Student {
     static int id = 934209405;
     static int idTwo = 892393;
     public static int printId(){
         return id;
     }
    public static int printIdTwo(){
        return idTwo;
    }
    public void printIdOneAndIdTwo(){
        System.out.println(printId());
        System.out.println(printIdTwo());
    }
    public static void main(String[] args) {
        Student student = new Student();
        student.printIdOneAndIdTwo();
//        System.out.println("Student id "+student.id) ;
//        System.out.println("Student id using static " + Student.id);
//        System.out.println("Student id using static " + id);
        //System.out.println(printId());
    }
}
