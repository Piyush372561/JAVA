import java.util.ArrayList;

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
    public static void main(String[] args) throws Exception {
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

       Mygenerics<Integer> mg = new Mygenerics<>(16, 49);
       int i = mg.getT1();
       System.out.println(i);

    }
}
