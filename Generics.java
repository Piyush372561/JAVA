import java.util.ArrayList;
public class Generics {
    public static void main(String[] args){
       /*ArrayList al = new ArrayList(); //This type of Writing Produce an error
       al.add("Str1");
       al.add(20);
       al.add(19);

       int a = al.get(2);
       System.out.println("A: "+a); */

       ArrayList<Integer> al2 = new ArrayList(); //This type of Writing Produce an error
       al2.add(20);
       al2.add(19);

       int b = al2.get(1);
       System.out.println("A: "+b);
    }
}
