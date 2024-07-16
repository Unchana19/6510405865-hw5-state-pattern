package models;

public class NoQuarterState implements StateInterface {
    private final Machine machine;

    public NoQuarterState(Machine machine) {
        this.machine = machine;
    }

    @Override
    public void insertQuarter() {
        machine.setState(machine.getHasQuarterState());
        System.out.println("You inserted a quarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You haven't inserted a quarter");
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned but there's no quarter");
    }

    @Override
    public void dispense() {
        System.out.println("You need to pay first");
    }

    @Override
    public String toString() {
        return "Machine is waiting for a quarter";
    }
}

//6510405865 Oanchana Changcharoen