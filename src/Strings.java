public class Strings {
    StringBuilder stringBuilder = new StringBuilder("MyName");


    public String getMyNameAndSurname() {
        stringBuilder.delete(0,6);
        return stringBuilder.append(" and my surname").toString();
    }

    public static void main(String[] args) {
        Strings strings = new Strings();
        System.out.println( strings.getMyNameAndSurname());
    }
}
