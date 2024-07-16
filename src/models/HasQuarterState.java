package models;

public class HasQuarterState implements StateInterface {
    private final Machine machine;

    public HasQuarterState(Machine machine) {
        this.machine = machine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can't insert another quarter");
    }

    @Override
    public void ejectQuarter() {
        machine.setState(machine.getNoQuarterState());
        System.out.println("Quarter returned");
    }

    @Override
    public void turnCrank() {
        machine.setState(machine.getGumballSoldState());
        System.out.println("You turned ...");
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