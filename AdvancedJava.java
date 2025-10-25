//COLLECTION FRAMEWORKS
import java.util.Date;
public class AdvancedJava {
    public static void main(String[] args){
        /* ArrayList<Integer> I = new ArrayList<>();
        I.add(3);
        I.add(6);
        I.add(9);
        I.add(12);
        I.add(15);
        
        I.set(1,40);
        System.out.println(I.contains(41));
        System.out.println(I.indexOf(6));
        System.out.println(I.lastIndexOf(6));
        System.out.println(I.contains(15));
        I.ensureCapacity(4);

        Iterator<Integer> it = I.iterator();
        while(it.hasNext()){
           System.out.println(it.next());
        }
        
        // I.add(0,1);
        ArrayList<Integer> I2 = new ArrayList<>();
        I2.add(2);
        I2.add(4);
        I2.add(6);
        I2.add(8);
        I2.add(10);
        I.addAll(0,I2); 

        for(int i = 0;i<I.size();i++){
            System.out.print(I.get(i));
            System.out.print(", ");
        }


        //ARRAY DEQUE
        /* ArrayDeque<Integer> ad = new ArrayDeque<>();
        ad.add(7);
        ad.add(97);
        //ad.addFirst(76);
        System.out.println(ad.getFirst());
        System.out.println(ad.getLast()); 

        //HASHING TECHNIQUE
        HashSet<Integer> myHashset = new HashSet<>(16 ,0.75f);
        myHashset.add(122);
        myHashset.add(25);
        myHashset.add(90);
        myHashset.add(8);
        myHashset.add(10);
        System.out.println(myHashset);*/


        //DATE AND TIME IN JAVA

        // this version is written by me 
        System.out.println(System.currentTimeMillis()/1000);
        System.out.println(System.currentTimeMillis()/3600);
        System.out.println(System.currentTimeMillis()/24);
        System.out.println(System.currentTimeMillis()/365);
        System.out.println(System.currentTimeMillis()/1000/3600/24/365);
        // the more elaborated version.
        System.out.println("Milliseconds: " + System.currentTimeMillis());//milliseconds hai 
        System.out.println("Seconds: " + System.currentTimeMillis() / 1000);// yaha milliseconds ko seconds me convert hogya 
        System.out.println("Hours: " + System.currentTimeMillis() / 1000 / 60 / 60); // yaha milliseconds hours me convert hogye 
        System.out.println("Days: " + System.currentTimeMillis() / 1000 / 60 / 60 / 24); // yaha days me convert hogye 
        System.out.println("Years: " + System.currentTimeMillis() / 1000 / 60 / 60 / 24 / 365); // yaha years me 

        System.out.println(Long.MAX_VALUE);
        System.out.println(System.currentTimeMillis());

        Date d = new Date();
        System.out.println(d);
        System.out.println(d.getTime());
        System.out.println(d.getTime());
        System.out.println(d.getDate());
        System.out.println(d.getSeconds());
        System.out.println(d.getMinutes());
        System.out.println(d.getYear());
        System.out.println(d.getDay());
    }
}
