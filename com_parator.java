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

        // Sort in ascending order by length
        return s1.length() - s2.length(); 

        // Sort in descending order by length
        //return s2.length() - s1.length(); 
    }
} 

class MyComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer a, Integer b) {

        // Sort in ascending order
        return a - b; 
       
       // Sort in descending order
       // return b - a; 
    }
    /* -ve aaya toh -> a pehle aayega
    +ve aaya toh -> b pehle aayega
    0 aaya toh -> dono equal hain */
}
        
public class com_parator {
    public static void main(String[] args) {
        System.out.println("Comparator");

        List<Student> students = new ArrayList<>();
        students.add(new Student("Piyush", 20));
        students.add(new Student("Micky", 22));
        students.add(new Student("Avi", 19));

        //Comparator<Student> com = Comparator.comparing(Student::getAge).reversed().thenComparing(Student::getName);

         students.sort((s1, s2) -> {
            if(s2.getAge() - s1.getAge() > 0) {
                return 1; 
            } else if (s2.getAge() - s1.getAge() < 0) {
                return -1;
            } else {
                return 0;
            }
        });  


        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(1);
        list.add(0);
        list.add(3);

        //Ye sort method list ke elements ko sort kar deta hai, aur null pass karne par natural order me sort karta hai.
        //list.sort(new MyComparator());
        //System.out.println(list);

        //Using lambda expression to sort the list of integers in ascending order
        list.sort((i1, i2) -> i1 - i2);
        System.out.println(list);

        //Ye sort method list ke elements ko sort kar deta hai, aur null pass karne par natural order me sort karta hai.
        list.sort(new MyComparator());
        System.out.println(list);

        List<String> words = Arrays.asList("Piyush", "Micky", "Avi");
        //Using a custom comparator to sort the list of strings based on their length
        words.sort(new StringLengthComparator());
        System.out.println(words);

        //Using lambda expression to sort the list of strings based on their length
        words.sort((s1, s2) -> s1.length() - s2.length());
        System.out.println(words);
   
    }
}
