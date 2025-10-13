import java.util.Iterator;
import java.util.LinkedList;
public class Linked_List {
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
        //Collections.sort(L);
        System.out.println(L.descendingIterator());
        for(int i = 0;i<L.size();i++){
            System.out.println(L.get(i));
        }
        LinkedList<Integer> In = new LinkedList<>();
        In.add(2);
        In.add(8);
        In.add(9);
        In.add(12);
        In.add(27);

        
        Iterator<Integer> it = In.descendingIterator();
        System.out.println(In.descendingIterator());
        for(int i = 0;i<In.size();i++){
            System.out.println(In.get(i));

        }
    }
}
