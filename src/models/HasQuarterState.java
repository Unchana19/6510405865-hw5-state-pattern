package models;

import java.util.Random;

public class HasQuarterState implements StateInterface {
    Random random = new Random(System.currentTimeMillis());
    private final Machine machine;

    public HasQuarterState(Machine machine) {
        this.machine = machine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can't insert another quarter");
    }

    @Override
    public void chooseFlavor(String flavor) {
        machine.getGumball().setFlavor(flavor);
        System.out.println("You have chosen the flavor " + flavor);
    }

    @Override
    public void ejectQuarter() {
        machine.setState(machine.getNoQuarterState());
        System.out.println("Quarter returned");
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned ...");
        int winner = random.nextInt(10);
        if ((winner == 0) && (machine.getGumball().getAmount() > 1)) {
            machine.setState(machine.getWinnerState());
        } else {
            machine.setState(machine.getGumballSoldState());
        }
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed");
    }

    @Override
    public String toString() {
        return "Machine is has a quarter";
    }
}

//6510405865 Oanchana Changcharoen