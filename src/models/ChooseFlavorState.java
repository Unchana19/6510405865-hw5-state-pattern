package models;

public class ChooseFlavorState implements StateInterface {
    private final Machine machine;

    public ChooseFlavorState(Machine machine) {
        this.machine = machine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can't insert quarter");
    }

    @Override
    public void chooseFlavor(String flavor) {
        machine.getGumball().setFlavor(flavor);
        System.out.println("You have chosen the flavor " + flavor);
        machine.setState(machine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        machine.setState(machine.getNoQuarterState());
        System.out.println("Quarter returned");
    }

    @Override
    public void turnCrank() {
        System.out.println("You have to choose flavor first");
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispense");
    }

    @Override
    public String toString() {
        return "Machine waiting for choose flavor";
    }
}

//6510405865 Oanchana Changcharoen
