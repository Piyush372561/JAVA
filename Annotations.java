class MorningGreetings{
    public void wish(){
        System.out.println("Hello!");
    }
}
class Greetings extends MorningGreetings{
    @Override
    public void wish(){
        System.out.println("Good Morning Sir! ");
    }
    @Deprecated
    public void NewMethod(){
        System.out.println("I am your new Servant.");
    }
}
@FunctionalInterface
    interface myFunctionalInterface {
        void Method();
    }
public class Annotations {
    @SuppressWarnings("deprecation")
    public static void main(String[] args){
        Greetings Mg = new Greetings();
        Mg.wish();
        Mg.NewMethod();
    }
}
