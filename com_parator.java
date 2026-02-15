import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Student{
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

   public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class StringLengthComparator implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        return s1.length() - s2.length(); // Sort in ascending order by length
        //return s2.length() - s1.length(); // Sort in descending order by length
    }
}

class MyComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer i1, Integer i2) {
       // return i1 - i2; Sort in ascending order
        return i2 - i1; // Sort in descending order
    }
}
        
public class com_parator {
    public static void main(String[] args) {
        System.out.println("Comparator");

        ArrayList<Student> students = new Arraylist<>();
        students.add(new Student("Piyush", 20));
        students.add(new Student("Micky", 22));
        students.add(new Student("Avi", 19));
        students.sort(null);


        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(1);
        list.add(0);
        list.add(3);

        list.sort((i1, i2) -> i1 - i2); // Sort in ascending order
        System.out.println(list);
        //Ye sort method list ke elements ko sort kar deta hai, aur null pass karne par natural order me sort karta hai.
        list.sort(new MyComparator());
        System.out.println(list);

        List<String> words = Arrays.asList("Piyush", "Micky", "Avi");
        //Using lambda expression to sort the list of strings based on their length
        words.sort((s1, s2) -> s1.length() - s2.length());
        System.out.println(words);

        words.sort(new StringLengthComparator());
        System.out.println(words);

    }
}
