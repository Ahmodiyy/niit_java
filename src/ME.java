public class ME {
    public  <T> void watchMovie(MovieDetail movieDetail){
        System.out.println("watching ...");
    }

    public static void main(String[] args) {
        ME me = new ME();
        MovieDetail lucy = new MovieDetail();
        lucy.setDirector("josh");
        lucy.setName("lucy");
        lucy.setWriter("osano");
        MovieDetail adnan = new MovieDetail();
        me.watchMovie(lucy);
    }
}
