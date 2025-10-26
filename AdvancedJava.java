//COLLECTION FRAMEWORKS
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;
public class AdvancedJava {
    public static void main(String[] args){
        /* ArrayList<Integer> I = new ArrayList<>();
        I.add(3);
        I.add(6);
        I.add(9);
        I.add(12);
        I.add(15);
        
        I.set(1,40);
        System.out.println(I.contains(41));
        System.out.println(I.indexOf(6));
        System.out.println(I.lastIndexOf(6));
        System.out.println(I.contains(15));
        I.ensureCapacity(4);

        Iterator<Integer> it = I.iterator();
        while(it.hasNext()){
           System.out.println(it.next());
        }
        
        // I.add(0,1);
        ArrayList<Integer> I2 = new ArrayList<>();
        I2.add(2);
        I2.add(4);
        I2.add(6);
        I2.add(8);
        I2.add(10);
        I.addAll(0,I2); 

        for(int i = 0;i<I.size();i++){
            System.out.print(I.get(i));
            System.out.print(", ");
        }


        //ARRAY DEQUE
        /* ArrayDeque<Integer> ad = new ArrayDeque<>();
        ad.add(7);
        ad.add(97);
        //ad.addFirst(76);
        System.out.println(ad.getFirst());
        System.out.println(ad.getLast()); 

        //HASHING TECHNIQUE
        HashSet<Integer> myHashset = new HashSet<>(16 ,0.75f);
        myHashset.add(122);
        myHashset.add(25);
        myHashset.add(90);
        myHashset.add(8);
        myHashset.add(10);
        System.out.println(myHashset);*/

        //DATE AND TIME IN JAVA
        // this version is written by me 
        System.out.println(System.currentTimeMillis()/1000);
        System.out.println(System.currentTimeMillis()/3600);
        System.out.println(System.currentTimeMillis()/24);
        System.out.println(System.currentTimeMillis()/365);
        System.out.println(System.currentTimeMillis()/1000/3600/24/365);
        // the more elaborated version.
        System.out.println("Milliseconds: " + System.currentTimeMillis());//milliseconds hai 
        System.out.println("Seconds: " + System.currentTimeMillis() / 1000);// yaha milliseconds ko seconds me convert hogya 
        System.out.println("Hours: " + System.currentTimeMillis() / 1000 / 60 / 60); // yaha milliseconds hours me convert hogye 
        System.out.println("Days: " + System.currentTimeMillis() / 1000 / 60 / 60 / 24); // yaha days me convert hogye 
        System.out.println("Years: " + System.currentTimeMillis() / 1000 / 60 / 60 / 24 / 365); // yaha years me 
        System.out.println(Long.MAX_VALUE);
        long l = System.currentTimeMillis(); // YEs we can store no. of milliseconds in a long type variable
        System.out.println("MilliSeconds: "+l);

        Date d = new Date(125 + 1900, 10, 26, 6, 25);
        // Date d = new Date(7578910);
        Date d2 = new Date("28 October 2025 12:20:36");
        System.out.println(d);
        System.out.println(d.getTime());
        //Deprecated method of Date class.
        System.out.println(d.getDate());
        System.out.println(d.getSeconds());
        System.out.println(d.getMinutes());
        System.out.println(d.getYear());
        System.out.println(d.getDay());
        System.out.println(d.hashCode());
        System.out.println(d.after(d2));
        System.out.println(d2.before(d));
        
        //CALENDAR CLASS 
        //Calendar cl = Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));
        Calendar cl = Calendar.getInstance();
        int hour12 = cl.get(Calendar.HOUR);
        int hour24 = cl.get(Calendar.HOUR_OF_DAY);
        int am_pm = cl.get(Calendar.AM_PM);
        System.out.println("In 12-hour format: "+hour12+ (am_pm == 0 ? "AM" : "PM"));
        System.out.println("In 24-hour format: "+hour24);
        System.out.println(cl.getCalendarType());
        System.out.println(cl.getTimeZone().getID());
        System.out.println(cl.getTime());
        System.out.println(cl.get(Calendar.SECOND));
        System.out.println(cl.get(Calendar.MINUTE));
        System.out.println(cl.get(Calendar.DATE));
        System.out.println(cl.get(Calendar.YEAR));
        System.out.println(cl.get(Calendar.HOUR));
        System.out.println(cl.get(Calendar.HOUR_OF_DAY));
        System.out.println(cl.get(Calendar.HOUR_OF_DAY)+ ":" +cl.get(Calendar.MINUTE)+ ":" +cl.get(Calendar.SECOND));

        //GREGORIAN CALENDAR
        GregorianCalendar GCal = new GregorianCalendar();
        System.out.println(GCal.isLeapYear(2020));

        //TIME ZONE 
       Calendar india = Calendar.getInstance(TimeZone.getTimeZone("Asia/kolkata"));
       Calendar Singapore = Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));

       System.out.println("Indian Time: "+india.getTime());
       System.out.println("Singapore Time: "+Singapore.getTime());

       System.out.println("Indian Time: "+india.get(Calendar.HOUR_OF_DAY));
       System.out.println("Singapore Time: "+Singapore.get(Calendar.HOUR_OF_DAY));

       System.out.println(TimeZone.getAvailableIDs()[0]);
       System.out.println(TimeZone.getAvailableIDs()[1]);
       System.out.println(TimeZone.getAvailableIDs()[2]);
       System.out.println(TimeZone.getAvailableIDs()[3]);
       System.out.println(TimeZone.getAvailableIDs()[4]);

       System.out.println(TimeZone.getDefault());

       //System.out.println(TimeZone.getTimeZone().getId());
       
       // JAVA.TIME API's 
       LocalDate ld = LocalDate.now();
       System.out.println(ld);

       LocalTime lt = LocalTime.now();
       System.out.println(lt);

       LocalDateTime ldt = LocalDateTime.now();
       System.out.println(ldt);

       DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy -- E H:ma");
       DateTimeFormatter dtf2 = DateTimeFormatter.ISO_DATE_TIME;
       String str = ldt.format(dtf);
       String str2 = ldt.format(dtf2); 
       System.out.println(str);
       System.out.println(str2);
    }
}
