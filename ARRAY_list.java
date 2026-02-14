import java.util.ArrayList;
public class ARRAY_list {
    public static void main (String[] args){

        //No. of ways to create an ArrayList
       // Default Constructor, creates an empty capacity of 10
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.remove(1);
        System.out.println("List using remove = "+list);
        list.remove(Integer.valueOf(1));
        System.out.println("List using remove(Integer.valueOf(1)) = "+list);
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
