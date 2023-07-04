package localize;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

public class DateLocale {
    public static void dateFormat(){
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.LONG,
                new Locale("de", "DE"));
        System.out.println(dateFormat.format(new Date()));
        System.out.println(new Date());
    }
    public static void numberFormat(){
        NumberFormat numberFormat = NumberFormat.getNumberInstance(
                new Locale("zh", "ZH"));
        System.out.println(numberFormat.format(1000));
        System.out.println(1000);
    }
    public static void textFormat(){
        Locale chineseLocale = new Locale("zh", "ZH");
        ResourceBundle resourceBundle = ResourceBundle.
                getBundle("welcome", chineseLocale);
        System.out.println(resourceBundle.getString("welcome"));
    }
    public static void main(String[] args) {
        textFormat();


    }
}
