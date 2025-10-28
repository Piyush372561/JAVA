import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
public class DateAndTime {
    public static void main(String[] args) throws Exception {

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

        //Add 5 days to a Date object (hint: use Calendar with setTime(Date)).
        // My Approach and how i understand the Question
        Date d3 = new Date(126,1,7);
        Date d4 = new Date(126,2,7);
        Date d5 = new Date(126,4,7);
        Date d6 = new Date(126,10,7);
        Date d7 = new Date(126,10,27);
        Calendar india = Calendar.getInstance();
        india.setTime(d3);
        System.out.println(india.getTime());
        india.setTime(d4);
        System.out.println(india.getTime());
        india.setTime(d5);
        System.out.println(india.getTime());
        india.setTime(d6);
        System.out.println(india.getTime());
        india.setTime(d7);
        System.out.println(india.getTime());

        // Correct Approach to understand a question
        Date ld3 = new Date(126,0,7); 
        Calendar India = Calendar.getInstance();
        India.setTime(ld3);
        System.out.println("Original Date: "+India);
        India.add(Calendar.DATE, 5);
        System.out.println("Date after 5 days: "+India.getTime());

        //CALENDAR CLASS 

        //Get the current hour, minute, and second using Calendar.
        Calendar India2 = Calendar.getInstance();
        System.out.println(India2.getTime());
        System.out.println(India2.get(Calendar.HOUR_OF_DAY));
        System.out.println(India2.get(Calendar.MINUTE));
        System.out.println(India2.get(Calendar.SECOND));

        //Print the current day of week, day of month, and month using Calendar.
        System.out.println(India2.get(Calendar.DAY_OF_WEEK));
        System.out.println(India2.get(Calendar.DAY_OF_MONTH));
        System.out.println(India2.get(Calendar.MONTH));
        //System.out.println(India2.get(Calendar.));

        //Create a Calendar for "Asia/Singapore" timezone and print the hour difference from "Asia/Kolkata".
        Calendar cl = Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));
        System.out.println("We are in "+cl.getTime()+" Time Zone.");
        //System.out.println(cl.getId());ye calendar class ke pass nhi TimeZone ke pass hota hai 
        System.out.println(cl.getTimeZone().getID());
        Calendar cl2 = Calendar.getInstance(TimeZone.getTimeZone("Asia/kolkata"));
        System.out.println("Indian Time: "+cl2.getTime());

        //Check if a Calendar date is before or after another date.
        if (cl2.before(cl)) {
            System.out.println(cl2+" Comes before "+cl);
        } else if(cl.before(cl2)){
            System.out.println(cl+" Comes before "+cl2);
        }else {
            System.out.println("Both Date are same.");
        }

        //Find the last day of the current month using Calendar.
        int i = cl.getMaximum(Calendar.DAY_OF_MONTH);
        System.out.println("Last Day of the is: "+i);

        // SIMPLE DATE FORMAT
        //Convert a Date object to a string in the format "dd-MM-yyyy HH:mm:ss".
        SimpleDateFormat Sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date d1 = new Date("28/10/2025 13:25:37"); 
        System.out.println(d1);
        
        //Parse a string "26/11/2025 14:30" to a Date object.
        SimpleDateFormat Sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        Date d9 = new Date();
        System.out.println("The actual Date is: "+d9);

        //Print the current date in 12-hour format with AM/PM.
        // My written code 
        Calendar cl5 = Calendar.getInstance();
        int In12Hformat = cl5.get(Calendar.HOUR);
        int Am_Pm = cl5.get(Calendar.AM_PM);
        System.out.println("In Day time: "+In12Hformat+ (Am_Pm == 0 ? "AM" : "PM"));// Wrong because you printing time only 
        // BY Chatgpt
        SimpleDateFormat Sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss a");
        Date now = new Date();
        System.out.println("Date and Time in 12-hour format: "+Sdf3.format(now));

        //Format the current date as "EEEE, MMMM dd, yyyy" (full day and month names).
        SimpleDateFormat Sdf4 = new SimpleDateFormat("EEEE, MMMM dd, yyyy");
        Date Now = new Date();
        System.out.println("New Format: "+Sdf4.format(Now));
        //Random Question
        SimpleDateFormat S5 = new SimpleDateFormat("EEEE, dd-MMMM-yyyy");
        Date d10 = new Date();
        System.out.println("New Format: "+S5.format(d10));

        //Convert a date string "28-10-2025" to yyyy/MM/dd format using SimpleDateFormat.
        SimpleDateFormat Sdf5 = new SimpleDateFormat("yyyy/MM/dd");
        Date d11 = new Date();
        System.out.println(Sdf5.format(d11));

        /* String str = "28-10-2025";
        SimpleDateFormat Output_date = new SimpleDateFormat("dd-MM-yyyy");
        System.out.println("Formatted Date: "+Output_date.format(str)); 

        try {
            String str = "28-10-2025";
            SimpleDateFormat inputFormat = new SimpleDateFormat("dd-MM-yyyy");
            Date date = inputFormat.parse(str);

            SimpleDateFormat outputFormat = new SimpleDateFormat("yyyy/MM/dd");
            String formattedDate = outputFormat.format(date);
            System.out.println("Formatted Date: " + formattedDate);

        } catch (ParseException e) {
            System.out.println("Invalid date format: " + e.getMessage());
        } */
        
            String str = "28-10-2025";
            SimpleDateFormat inputFormat = new SimpleDateFormat("dd-MM-yyyy");
            Date date = inputFormat.parse(str);

            SimpleDateFormat outputFormat = new SimpleDateFormat("yyyy/MM/dd");
            String formattedDate = outputFormat.format(date);
            System.out.println("Formatted Date: " + formattedDate);
            
        //4️⃣ TimeZone
    }
}
