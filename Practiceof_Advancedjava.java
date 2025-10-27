import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
public class Practiceof_Advancedjava {
    public static void main(String[] args) {
        // PROBLEM 1
        ArrayList<String> Al = new ArrayList<>();
        Al.add("Ayush ");
        Al.add("Piyush");
        Al.add("Pranav");
        Al.add("Daksh");
        Al.add("Vaibhav");
        for(Object O: Al){
            System.out.println(Al);
        }
        for(Object O: Al){
            System.out.println(O);
        }
        //PROBLEM 2
        Date d = new Date();
        System.out.println(d.getHours()+ ":" +d.getMinutes()+ ":" +d.getSeconds());

        //PROBLEM 3
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.HOUR)+ ":" +c.get(Calendar.MINUTE)+ ":" +c.get(Calendar.SECOND));
        System.out.println(c.get(Calendar.HOUR_OF_DAY)+ ":" +c.get(Calendar.MINUTE)+ ":" +c.get(Calendar.SECOND));

        //PROBLEM 4
        LocalDate ld = LocalDate.now();
        DateTimeFormatter Df = DateTimeFormatter.ofPattern("H:m:s");
        String date = ld.format(Df);
        System.out.println(date);
        //PROBLEM 5
        HashSet<Integer> s = new HashSet<>();
        s.add(2);
        s.add(4);
        s.add(6);
        s.add(7);
        s.add(8);
        s.add(2);
        System.out.println(s);
        

    }
}
