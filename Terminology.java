// Inheritance Example
/* class SuperClass {
    int INT;

    public int getINT(){
        return INT;
    }
    public void setINT(int i){
        INT = i;
    }
}
class SubClass extends SuperClass{
    int X;

    public int getX(){
        return X;
    }
    public void setX(int x){
        X = x;
    }
}
// Quick Quiz
class Animal{

}
class Dog extends Animal {
    String name;
    String breed;

    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }

    public String getBreed(){
        return breed;
    }
    public void setBreed(String b){
        breed = b;
    }

    public void dogSound(){
    System.out.println("barks barks ................");
    }
}
//CONSTRUCTORS IN INHERITANCE.
// constructors me ky hota hai ki jab bhi hum obj bnate hai toh by default constructors call ho jata hai but getters or setters methods hi jinko jab hum call krege tab hi vo run hoge simple 

class ParentClass{
    ParentClass(){
        System.out.println("I am a ParentClass Constructor.");
    }
    ParentClass(int a){
        System.out.println("I am an overloaded constructor with the value a as: "+a);
    }

}
class childClass extends ParentClass{
    childClass(){
        super(0);
        System.out.println("I am a childClass Constructor.");
    }
    childClass(int a,int b){
        super(a);
        System.out.println("I am an overloaded childClass constructor with b as: "+b);
    }
    
}
class Grandchild extends childClass{
    Grandchild(){
        System.out.println("I am a Grandchild Constructor.");
    }
    Grandchild(int a,int b,int c){
        super(a,b);
        System.out.println("I am an overloaded Constructor with a value of: "+c);
    }
}

// Polymorphism Example
/* class Poly{

} 

public class Terminology{
 public static void main(String[] args){
    // Here you have made 2 different objects capital S for superclass and Small s for subclass that's here commes if you made only one object then program will run smoothly.
    // Creating an object for Superclass.
   SuperClass S = new SuperClass();
    S.setINT(4);
   System.out.println("The value of I in SuperClass is: "+S.getINT());

   // Creating an object for SubClass.
   SubClass s = new SubClass();
   s.setINT(2005);
   System.out.println("The value of I in subclass will be: "+s.getINT());

   // 
   Dog d = new Dog();
   d.setName("JoJo");
   d.setBreed("Labradour");
   System.out.println(d.getName());
   System.out.println(d.getBreed());
   d.dogSound();
   
   //Constructors in INHERITANCE
   
   ParentClass p = new ParentClass();
   childClass c = new childClass();
   childClass c2 = new childClass(4,6);
   Grandchild gc = new Grandchild(4,6,8);
   

 }
}   */
