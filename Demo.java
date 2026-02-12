import java.util.Scanner;
public class Demo {
    public static void main(String[] args) {
        System.out.println("Hello World.");

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("Hey "+x);
        sc.close();
    }
}
