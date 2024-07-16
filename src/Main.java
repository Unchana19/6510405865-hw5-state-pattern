import models.Gumball;
import models.Machine;

public class Main {
    public static void main(String[] args) {
        Gumball gumball = new Gumball(5);
        Machine gumballMachine = new Machine("Mighty Gumballs", gumball);

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.dispense();

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.ejectQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.dispense();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.dispense();
        gumballMachine.ejectQuarter();

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.dispense();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.dispense();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);
    }
}

//6510405865 Oanchana Changcharoen