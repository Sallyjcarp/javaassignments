package fifth.assignment;

public class Lights {

    public static void main(String[] args){
        System.out.println("Creating a Bulb...");
        Bulb b = new Bulb ();
        System.out.println("Bulb is now " + b.stateToString() + ".");
        System.out.println("Change the state ....");
        b.change();
        System.out.println("Bulb is now " + b.stateToString() + ".");
    }
}