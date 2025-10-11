import java.util.Collections;
import java.util.LinkedList;
public class LiknkedList {
    public static void main(String[] args){
        LinkedList<String> L = new LinkedList<>();
        L.add("Ford");
        L.add("Hyundai");
        L.add("Maruti Suzuki");
        L.add("EV");
        
        //Different Methods of LinkedList.
        L.addFirst("Piyush");
        L.addLast("Kushwaha");




        Collections.sort(L);

        for(int i = 0;i<L.size();i++){
            System.out.println(L.get(i));
        }
    }

}
