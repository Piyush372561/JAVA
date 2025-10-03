// Practice sheet 4


// Question 1 -> iska output me error aara hai kyuki condition me boolean hona chiye
// or hum assign nhi kr skte yaha 
/*
import java.util.*;
public class Program_1 {
    public static void main(String[] args) {
        int a = 10;
        
        if(a=11){
            System.out.println("I am 11 years old");
        }else{
            System.out.println("I am 10 years old");
        }
    }
} */
//Question 2 ->  W A P in java to find out whetehr a student is pass or fail; if it requires total 40% and at least 33% in each subject to pass. Assume 3 //subjects and take marks as an input from the user. 
/*
import java.util.*;
public class Program{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the marks of three subjects: ");
        double Mathematics = sc.nextInt();
        double Science = sc.nextInt();
        double Computer = sc.nextInt();
        
        //double TotalMarks = ((Mathematics + Science + Computer)/300) *100;
        // is if else me galat hora hai agr total percentage uski 40 se zyada hai or kisi ek subject me 33 se kam number aaye fir ?
        
        if(TotalMarks >= 40){
            if(Mathematics >=33){
                System.out.println("Student is pass in maths");
            }if(Science >= 33){
                System.out.println("Student is pass in Science");
            }if(Computer >= 33){
                System.out.println("Student is pass in Computer");
            }
        }else{
            System.out.println("Student is fail");
        }
    }
} */
// Question 2 ka sahi code 
/*
import java.util.*;
public class Program_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the marks of Maths: ");
        int maths = sc.nextInt();
        
        System.out.print("Enter the marks of Science: ");
        int science = sc.nextInt();
        
        System.out.print("Enter the marks of English: ");
        int english = sc.nextInt();
        
        double Total = maths + science + english;
        System.out.println("Total = " +Total);
        
        double percentage = (Total/300) * 100;
        System.out.println("Percentage = " +percentage);
        
        if( maths >= 33 && science >= 33 && english >= 33 && percentage >= 40){
            System.out.println("Harish is pass.");
        }else{
            System.out.println("Harish is fail.");
        }
    }
} */
// Quetion 3 -> calculate income taxpaid by an emplayee to the government as per the slabs mentioned below
/*       income slab           Tax
         2.5L- 5.0L            5%
         5.0L-10.0L            20%
         Above 10.0L           30%
         Note that there is no tax below 2.5L. Take amount as an input from the user */
         
/*
import java.util.*;
public class Program_3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the Income = ");
        double income = sc.nextInt();
        
        if(income >= 250000 && income <= 500000){
            System.out.println("An Employee have to pay 5% Tax from his/her salary");
        }
        else if(income >= 500000 && income <= 1000000){
            System.out.println("An Employee have to pay 20% Tax from his/her salary");
        }
        else if(income > 1000000){
            System.out.println("An Employee have to pay 30% Tax from his/her salary");
        }
        else if(income < 250000){
            System.out.println("An Employee don't need to give any taxes");
        }
    }
} */
// question 4 
/*
import java.util.*;
public class Program_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();
        
        switch(num){
            case 1:
                System.out.println(" It's Monday Guyzzzz! ");
                break;
            case 2:
                System.out.println(" It's Tuesday Guyzzzz! ");
                break;
            case 3:
                System.out.println(" It's Wednesday Guyzzzz! ");
                break;
            case 4:
                System.out.println(" It's Thursday Guyzzzz! ");
                break;
            case 5:
                System.out.println(" It's Friday Guyzzzz! ");
                break;
            case 6:
                System.out.println(" It's Saturday Guyzzzz! ");
                break; 
            case 7:
                System.out.println(" It's Sunday Guyzzzz! ");
                break;    
            default:
            System.out.println("Wrong variable");
        }
    }
} */
// Question 5
/*
import java.util.*;
public class Program_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter year: ");
        int Year = sc.nextInt();
        
        if((Year % 4 == 0 && Year % 100 != 0) || Year % 400 == 0){
            System.out.println(" The " +Year+ " is a Leap year");
        }else{
             System.out.println(" The " +Year+ " is not a Leap year");
        }
    }
}
// Question 6 ->  w a p in java to find out the type of of website from the url 
            //      .com -> commercial website
            //    .org -> organisation website
            //  .in -> indian website
            
import java.util.*;
public class Program_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the URL: ");
        String url = sc.nextLine();
        
        if(url.endsWith(".com")){
            System.out.println("It is an commercial website. ");
        }else if(url.endsWith(".org")){
            System.out.println("It is an organisational website. ");
        }else if(url.endsWith(".in")){
            System.out.println("It is an indian website. ");
        }
    }
} */