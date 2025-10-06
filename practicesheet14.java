import java.util.Scanner;
public class practicesheet14 {
    public static void main(String[] args){
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
        Scanner sc = new Scanner(System.in);
        System.out.print("Variable 6: ");
        int var6 = sc.nextInt();
        System.out.print("Variable 7: ");
        int var7 = sc.nextInt();
        try {
            if(var6 < 0 || var7 <0){
                throw new IllegalArgumentException("Value must be from 1 to 100");
            }
            int var8 = var6/var7;
            System.out.println();
        } catch (ArithmeticException e) {
            System.out.println("HaHa");
        } catch(IllegalArgumentException e){
            System.out.println("HeHe");
        }



    }
}
