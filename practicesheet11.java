// PRACTICE SHEET OF CHAPTER 11



// Question --> 1
/* abstract class Pen {
    abstract void Write();
    abstract void refill();
    // This is wrong
    /*public  void Write(){
        System.out.println("Writing.............");
    }
    public  void refill(){
        System.out.println("Refilling............");
    } 
}

// Question --> 2
class FountainPen extends Pen{
    void Write(){
        System.out.println("Writing.............");
    }
    void refill(){
        System.out.println("Refilling............");
    }
    void changeNib(){
        System.out.println("Change your pens nib.");
    }
}

// Question --> 3
interface BasicAnimal{
    void Eat();
    void sleep(); 
}
class Monkey{
    public void jump(){
        System.out.println("A Monkey can jump.");
    }
    public void bite(){
        System.out.println("A Monkey can bite.");
    }
}
class Human extends Monkey implements BasicAnimal{
    public void Eat(){
        System.out.println("Eating.....");
    }
    public void sleep(){
        System.out.println("Sleeping...");
    }
}

//Question --> 4
abstract class TelePhone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect(); 
}
class SmartTelePhone extends TelePhone {
    @Override
    public void ring(){
        
    }
    @Override
    public void lift(){

    }
    @Override
    public void disconnect(){
        
    }
    public void output(){
        System.out.println("We can also call Smartphone as a telePhone.");
    }
}

//Question --> 6
interface TVremote{

}
interface SmartTVremote extends TVremote {

}

//Question --> 7
class TV implements TVremote {

}
public class pQ_absint_60{
    public static void main(String[] args) {

        //Question --> 1
        //Question --> 2
        FountainPen fp = new FountainPen();
        fp.Write();
        fp.refill();
        fp.changeNib();
        System.out.println();
        //Question --> 3
        System.out.println("Question -> 3?");
        Monkey Ba = new Human();
        Ba.jump();
        Ba.bite();
        // cannot use these methods because we use because the reference is monkey which does not eat and sleep.
        BasicAnimal ba = new Human();
        ba.Eat();
        ba.sleep();
        //Question --> 4
        SmartTelePhone Vivo = new SmartTelePhone();
        Vivo.ring();
        Vivo.lift();
        Vivo.output();
        Vivo.disconnect();
        //Question --> 5
        //Question --> 6
      
    }
} */
