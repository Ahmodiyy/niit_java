public class SearchLetter {
     String a =  "ape";
    public static void main(String[] args) {
        SearchLetter searchLetter = new SearchLetter();
        char p = 'e';
        for (int a=0; a<3; a++){
            if(searchLetter.a.charAt(a) == p){
                System.out.println("found at index "+ a);
            }



        }
    }
}
