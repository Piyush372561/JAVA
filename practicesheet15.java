import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class practicesheet15 {
    public static void main (String[] args){
        //ARRAYLIST 

        List<String> Car = new ArrayList<>();

        //var Car = new ArrayList<String>(); 

        //ArrayList<String> Car = new ArrayList<>();

        Car.add("Ford");
        Car.add("Hyundai");
        Car.add("Maruti Suzuki");
        Car.add("EV");
        //Car.set(0,"Scorpio");

        //Car.remove(2);
        //Car.clear();

        //for(int i = 0;i<Car.size();i++){
        //    System.out.println(Car.get(i));
        //}

        //Sorting of an ArrayList
        Collections.sort(Car);

        for(String i : Car){
           System.out.println(i);
        }
        //System.out.println(Car);
    }
}
