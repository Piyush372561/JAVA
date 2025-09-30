import java.util.Scanner;

public class vd_81 {
    public static void main(String[] args){
        int[] i = {10,20,30};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the index number: ");
        int ind = sc.nextInt();

        System.out.println("Enter the number you want to divide the value with ");
        int number = sc.nextInt();
        try {
            System.out.println("The value at array index enterd is: "+i[ind]);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
