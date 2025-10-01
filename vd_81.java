//Ek imp note ki jab exception try ke andar aayega tab hi catch usse pkdega jaise lets take an instance ki agr jo values hum try ke andar input le rhe hai agar hum unki jagah kuch type ki values input kr de toh catch statement uss ke exception ko pkd lega 
// or agar hum uske bahar aisa krte hai toh vo seedha hi exception throw krdega bina try tak jaye bina 
import java.util.Scanner;

public class vd_81 {
    public static void main(String[] args){
        int[] i = {10,20,30};
        Scanner sc = new Scanner(System.in);
        /* System.out.print("Enter the index number: ");
        int ind = sc.nextInt();

        System.out.print("Enter the number you want to divide the value with: ");
        int number = sc.nextInt(); */
        try {
            System.out.print("Enter the index number: ");
            int ind = sc.nextInt();

            System.out.print("Enter the number you want to divide the value with: ");
            int number = sc.nextInt();
            System.out.println("The value at array index enterd is: "+i[ind]);
            System.out.println("The value of array-value/number is: "+i[ind]/number);

        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException Occured!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException Occured!");
        } catch (Exception e) {
            System.out.println("Some Other Exception");
        }
    }
}
