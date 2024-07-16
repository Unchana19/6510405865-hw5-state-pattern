package models;

public class WinnerState implements StateInterface{
    private final Machine machine;

    public WinnerState(Machine machine) {
        this.machine = machine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can't insert a quarter");
    }

    @Override
    public void chooseFlavor(String flavor) {
        System.out.println("You can't choose flavor");
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
        System.out.println("YOU'RE A WINNER! You got two gumballs for your quarter");
        machine.gumballSold();
        if(machine.getGumball().getAmount() == 0) {
            machine.setState(machine.getOutOfGumballState());
        } else {
            machine.gumballSold();
            if(machine.getGumball().getAmount() > 0) {
                machine.setState(machine.getNoQuarterState());
            } else {
                System.out.println("Oops, out of gumball!");
                machine.setState(machine.getOutOfGumballState());
            }
        }
    }

    @Override
    public String toString() {
        return "Machine is giving you a gumball";
    }
}

//6510405865 Oanchana Changcharoen