


import java.util.Scanner;
class CLASS{
    String NAAM;
    public CLASS(String name){
        NAAM = name;
        System.out.println("Name of the Candidate is: " +NAAM);
    }
}



//import java.util.Scanner;
public class Exceptclass {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //INPUT MISMATCH ERROR.

        /* System.out.println("Enter the value: ");
        int a = sc.nextInt();
        System.out.println(a); */

        // ARITHEMATIC EXCEPTION.
        /*System.out.print("a: ");
        int a = sc.nextInt();
        System.out.print("b: ");
        int b = sc.nextInt();
        try {
            int c = a / b;
        System.out.println("Answer: "+c);
        } catch (ArithmeticException e) {
            System.out.println("ArithematicException Occured.");
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException Occured.");
        } catch(Exception e){
            System.out.println("Some other Error Occured.");
        }  */

        // ARRAY INDEX OUT OF BOUNDS EXCEPTION.

        /*System.out.print("Size of an Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Elements of an Array: ");
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0;i<n;i++){
            System.out.println(arr[i]+ " ");
        }
        // ARRAY INDEX OUT OF BOUNDS EXCEPTION.
        System.out.println(arr[5]); */

        //IILEGAL ARGUMENT EXCEPTION.
        CLASS c = new CLASS(" ");
        //c.CLASS();
    }
}
