import java.time.LocalDate;
import java.util.Date;
public class DateAndTime {
    public static void main(String[] args){
        //Create a Date object for the current time and print it.
        Date d = new Date();
        System.out.println(d.getTime());
        System.out.println(d);
        //Create a Date object using a specific date string like "26 Nov 2025 14:30:00" and print it.
        Date d2 = new Date("02 Nov 2025 14:30:00");
        System.out.println(d2);
        //Print year, month, and day of a Date object.
        System.out.println(d2.getDate());
        System.out.println(d2.getYear());
        System.out.println(d2.getMonth());
        System.out.println(d2.getDay());
        //Compare two Date objects and print which one is earlier.
        System.out.println(d.before(d2));
        if(d.before(d2)){
            System.out.println(d+" comes Earlier");
        } else if(d2.before(d)){
            System.out.println(d2+" comes Earlier");
        } else {
            System.out.println("Both Are same dates.");
        }
        LocalDate ld1 = LocalDate.of(2025,10,26);
        LocalDate ld2 = LocalDate.of(2025,11,05);
        if(ld1.isBefore(ld2)){
            System.out.println(ld1+" comes Earlier");
        } else if(ld2.isBefore(ld1)){
            System.out.println(ld2+" comes Earlier");
        } else {
            System.out.println("Both Are same dates.");
        }
    }
}
