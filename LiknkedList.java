import java.util.Collections;
import java.util.LinkedList;
public class LiknkedList {
    public static void main(String[] args){
        LinkedList<String> L = new LinkedList<>();
        L.add("Name: ");
        L.add("Class: ");
        L.add("Roll number: ");
        L.add("Subject: ");

        //Different Methods of LinkedList.
        L.addFirst("Piyush");
        L.addLast("Kushwaha");
        L.set(2,"School");
        //L.remove(3);
        //L.clear();
        Collections.sort(L);

        for(int i = 0;i<L.size();i++){
            System.out.println(L.get(i));
        }
    }

}
