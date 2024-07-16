package models;

public class GumballSoldState implements StateInterface{
    private final Machine machine;

    public GumballSoldState(Machine machine) {
        this.machine = machine;
    }
    @Override
    public void insertQuarter() {
        System.out.println("Please wait, we're already giving you a gumball");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You can't eject, you haven't inserted a quarter yet");
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned but there are no gumballs");
    }

    @Override
    public void dispense() {
        machine.gumballSold();
        System.out.println("A gumball comes rolling out the slot");
        if (machine.getGumball().getAmount() > 0) {
            machine.setState(machine.getNoQuarterState());
        } else {
            System.out.println("Oops, out of gumballs!");
            machine.setState(machine.getOutOfGumballState());
        }
    }

    @Override
    public String toString() {
        return "Machine is giving you a gumball";
    }
}

//6510405865 Oanchana Changcharoen