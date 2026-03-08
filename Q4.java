import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                int mat = sc.nextInt();
                System.out.print(mat + " ");
            }
            System.out.println();
        }
    }
}