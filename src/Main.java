import models.Gumball;
import models.Machine;

public class Main {
    public static void main(String[] args) {
        Gumball gumball = new Gumball(5);
        Machine gumballMachine = new Machine("Mighty Gumballs", gumball);

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.chooseFlavor("Mango");
        gumballMachine.chooseFlavor("Orange");
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);
    }
}

//6510405865 Oanchana Changcharoen