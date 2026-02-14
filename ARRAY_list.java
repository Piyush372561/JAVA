import java.util.ArrayList;
import java.util.Collections;
public class ARRAY_list {
    public static void main (String[] args){

        //No. of ways to create an ArrayList
       // Default Constructor, creates an empty capacity of 10
        ArrayList<Integer> list = new ArrayList<>();

        list.add(4);
        list.add(1);
        list.add(0);
        list.add(3);
        list.remove(1);
        System.out.println("List using remove = "+list);
        list.remove(Integer.valueOf(1));
        System.out.println("List using remove(Integer.valueOf(1)) = "+list);

        //we can convert list into Array using toArray() method. There are two variations of this method:
        Object[] array = list.toArray();
        Integer[] array2 = list.toArray(new Integer[0]);
        System.out.println("Array using toArray() method = "+array);
        System.out.println("Array using toArray(new Integer[0]) method = "+array2);

        //Sorting of an Arraylist
        Collections.sort(list);
        System.out.println(list);

        /*
         
        //creating an Arraylist with a specified initial capacity
        2. ArrayList<Integer> list = new ArrayList<>(20);

        //creating an ArrayList from another collection
        3. list<String> anotherList = Arrays.asList("A", "B", "C");
           ArrayList<String> listFromCollection = new ArrayList<>(anotherList);

        // This creates an immutable list, which cannot be modified after creation.
        4. List<Integer> list4 = List.of(1, 2, 3, 4, 5);
         list.addAll(list);
         System.out.println(list);
          */
        
    }
}
