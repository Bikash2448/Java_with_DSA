import java.text.SimpleDateFormat;
import java.util.Calendar;

public class celendar {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();  
        System.out.println("The current date is : " + calendar.getTime());
        // System.out.println("4 months later: " + calendar.getTime());  
        // calendar.add(Calendar.YEAR, 2);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/yyyy/MM");  
        String Date =sdf.format(calendar.getTime());
        System.out.println("Today is: "+Date);
    }
}
