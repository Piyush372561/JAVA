import java.util.Scanner;
public class practicesheet14 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    //Question-1 -> WAP in java to demonstrate syntax,logical and runtime error.

        /* //SYNTAX ERROR
        int var1 = 40;
        System.out.println("Y: "+var1);

        //Logical error
        int var2 = 12;
        int var3 = 13;
        int var4 = var2 - var3;
        System.out.println("The sum of b + c = "+var4);

        //RUNTIME ERROR
        Scanner sc = new Scanner(System.in);
        System.out.print("Value: ");
        int var5 = sc.nextInt();
        System.out.println(var5);*/

    //Question-2 -> WAP in java that prints 'haha' during Arithmetic Exception and 'hehe' during an IIlegal Argument Exception.
       /*System.out.print("Variable 6: ");
        int var6 = sc.nextInt();
        System.out.print("Variable 7: ");
        int var7 = sc.nextInt();
        try {
            if(var6 < 0 || var7 <0){
                throw new IllegalArgumentException();
            }
            int var8 = var6/var7;
            System.out.println();
        } catch (ArithmeticException e) {
            System.out.println("HaHa");
        } catch(IllegalArgumentException e){
            System.out.println("HeHe");
        } */

    //Question3 -> WAP in java that allows you to keep accessing an array until a valid index is given. if max retries exceeds 5 print "Error".
        int[] arr = {2,4,6,8,10,12};

        int retries = 0;
        boolean valid = false;
        while(retries < 5){
            System.out.println("Enter the value of index: ");
            int i = sc.nextInt();
            
            try {
                System.out.println("Value at index "+i+" is: "+arr[i]);
                System.out.println("Yes! Now you've entered the right index");
                valid = true;
                break;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid Index. Try Again.");
                retries++;
            }
        }
        if (!valid) {
            System.out.println("Error");
        }
        System.out.println("Thanks for using this program.");

    }
}
