//Quick Quiz Question -> Write a Java program that allows you to keep accessing an array until a valid index is given by the user ?
import java.util.Scanner;
public class QuickQuiz {
    public static void main(String[] args){
        int[] arr = new int[3];
        arr[0] = 2;
        arr[1] = 4;
        arr[2] = 6;
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while(flag){
        System.out.print("Enter the value: ");
        int i = sc.nextInt();
        try {
            System.out.println("Let's TRY for once.");
            try {
                System.out.println(arr[i]);
                System.out.println("Yes! Now you've entered the right index.");
                flag = false;
            } catch (Exception e) {
                System.out.println("This is a Level 2 Exception.");
            }
        } catch (Exception e) {
            System.out.println("This is a Level 1 Exception.");
        }
    }
    System.out.println("Thanks Using this Program.");
    }
}
