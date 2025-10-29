class MorningGreetings{
    public void wish(){
        System.out.println("Good Morning Sir!");
    }
}
class Greetings extends MorningGreetings{
    @Override
    public void wish(){
        System.out.println("Good Morning Sir!");
    }
}
public class Annotations {
    public static void main(String[] args){
        Greetings Mg = new Greetings();
        Mg.wish();
    }
}
