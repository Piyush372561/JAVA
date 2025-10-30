/* import java.util.ArrayList;

class Mygenerics<T1> {
    int var1 = 20;
    private T1  t1;

    public Mygenerics(int var1, T1 t1){
        this.var1 = var1;
        this.t1 = t1;
    }

    public T1 getT1() {
        return t1;
    }
    public void set(T1 t1){
        this.t1 = t1;
    }

    public int getvar1(){
        return var1;
    }
    public void setvar1(){
        this.var1 = var1;
    }
}

public class Generics {
    public static <T> void printArray(T[] array){
        for(T item:array){
            System.out.println(item);
        }

    }
    public static void main(String[] args) throws Exception {
       /*ArrayList al = new ArrayList(); //This type of Writing Produce an error
       al.add("Str1");
       al.add(20);
       al.add(19);

       int a = al.get(2);
       System.out.println("A: "+a); 

       ArrayList<Integer> al2 = new ArrayList(); //This type of Writing Produce an error
       al2.add(20);
       al2.add(19);

       int b = al2.get(1);
       System.out.println("A: "+b);

       Mygenerics<Integer> mg = new Mygenerics<>(16, 49);
       int i = mg.getT1();
       System.out.println(i);
       
       String[] name = {"Piyush","Daksh"};
       int[] numbers = {1,2,3};
       printArray.name();
       printArray.numbers();
    }
} */

//NEW PROGRAM
class stats<T extends Number>{

    T[] nums;

    stats(T[] nums){
        this.nums = nums;
    }
    double average() {
        double sum = 0;
        for(T nums : nums){
            sum += nums.doubleValue();
        }
        return sum / nums.length; 
    }
}

public class Generics {
    // Generic method: works with any type T
    public static <T> void printArray(T[] array){
        for(T item:array){
            System.out.println(item);
        }
    }
    public static <T extends Number> void Squareofnumber(T num){
        double result = num.doubleValue() * num.doubleValue();
        int result2 = num.intValue() * num.intValue();
        System.out.println("Square = "+result);
        System.out.println("Square = "+result2);
    }
    public static void main(String[] args){
        // Array of Strings
        String[] names = {"Piyush","Daksh"};

        //Array of Integers
       // method expects a parameter of type T[] where T is a reference type (a class/type parameter).

        //int[] is an array of the primitive type int, not an array of objects (Integer, String, etc.).

        //Java generics work only with reference types (objects). They do not accept primitive types (int, char, boolean, etc.) as type parameters.
        //int[] numbers = {1,2,3};

        Integer[] numbers = {1,2,3};

        // Call the generic method with both arrays
        printArray(names);
        printArray(numbers);

        Integer[] intnums = {10,20,30,40,50};
        stats<Integer> intstats = new stats<>(intnums);
        System.out.println(intstats);
        System.out.println(intstats.average());

        Double[] intdub = {5.5, 5.6, 5.7, 5.8, 5.9};
        stats<Double> intstats2 = new stats<>(intdub);
        System.out.println(intstats2);
        System.out.println(intstats2.average());

        Squareofnumber(5);
        Squareofnumber(10);

    }
}
