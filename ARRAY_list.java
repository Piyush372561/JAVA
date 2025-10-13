import java.util.ArrayList;
import java.util.Collections;

public class ARRAY_list {
    public static void main (String[] args){
        //ARRAYLIST 

        //List<String> Car = new ArrayList<>();

        //var Car = new ArrayList<String>(); 

        ArrayList<String> Car = new ArrayList<>();
        Car.add("Ford");
        Car.add("Hyundai");
        Car.add("Maruti Suzuki");
        Car.add("EV");

        //Different methods of ArrayList
        //Car.set(0,"Scorpio");
        //Car.remove(2);
        //Car.clear();
        //Car.contains("Thar");
         //Sorting of an ArrayList
        Collections.sort(Car);
        //System.out.println(Car.contains("Thar"));
        


        //for(int i = 0;i<Car.size();i++){
        //    System.out.println(Car.get(i));
        //}
        if (Car.contains("Thar")) {
            System.out.println("Yes!!! We have Thar.");
        } else{
            System.out.println("Sorry! Sir We don't Sell Mahindra Cars.");
        }

        for(String i : Car){
           System.out.println(i);
        }
        //System.out.println(Car);
        ArrayList<String> ClonedList = (ArrayList<String>) Car.clone();
        ClonedList.add("Thar");
        ClonedList.add("Nano");
        for(int i = 0;i<ClonedList.size();i++){
            System.out.println(ClonedList.get(i));

        }
    }
}
