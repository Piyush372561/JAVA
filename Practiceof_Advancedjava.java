import java.util.ArrayList;
public class Practiceof_Advancedjava {
    public static void main(String[] args) {
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
    }
}
