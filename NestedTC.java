import java.util.Scanner;
public class NestedTC {
    public static void main(String[] args){
        int[] arr = new int[3];
        arr[0] = 2;
        arr[1] = 4;
        arr[2] = 6;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value: ");
        int i = sc.nextInt();
        try {

            System.out.println("Hello! Here comes the ");
            System.out.println(arr[i]);
            try {
                //System.out.println(arr[i]);
            } catch (Exception e) {
                System.out.println("Level 2 Exception.");
            }
        } catch (Exception e) {
            System.out.println("Level 1 Exception.");
        }

    }
}
