import java.util.HashSet;
public class AdvancedJava {
    public static void main(String[] args){
       /*  ArrayList<Integer> I = new ArrayList<>();
        ArrayList<Integer> I2 = new ArrayList<>();
        I.add(3);
        I.add(6);
        I.add(9);
        I.add(12);
        I.add(15);

        I2.add(2);
        I2.add(4);
        I2.add(6);
        I2.add(8);
        I2.add(10);
        
        I.addAll(0,I2);
        I.set(1,40);
        System.out.println(I.contains(41));
        System.out.println(I.indexOf(6));
        System.out.println(I.lastIndexOf(6));
       // I.add(0,1);
        for(int i = 0;i<I.size();i++){
            System.out.print(I.get(i));
            System.out.print(", ");
        }
        System.out.println();

        ArrayDeque<Integer> ad = new ArrayDeque<>();
        ad.add(7);
        ad.add(97);
        //ad.addFirst(76);
        System.out.println(ad.getFirst());
        System.out.println(ad.getLast()); */

        //HASHING TECHNIQUE
        HashSet<Integer> myHashset = new HashSet<>(16 ,0.75f);
        myHashset.add(122);
        myHashset.add(25);
        myHashset.add(90);
        myHashset.add(8);
        myHashset.add(10);
        System.out.println(myHashset);
        
    }
}
