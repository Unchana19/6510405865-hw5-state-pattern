package models;

public class Machine implements StateInterface {
    private final String name;
    private final Gumball gumball;
    private StateInterface state;

    private final StateInterface hasQuarterState;
    private final StateInterface noQuarterState;
    private final StateInterface gumballSoldState;
    private final StateInterface outOfGumballState;

    public Machine(String name, Gumball gumball) {
        this.name = name;
        this.gumball = gumball;

        this.hasQuarterState = new HasQuarterState(this);
        this.noQuarterState = new NoQuarterState(this);
        this.gumballSoldState = new GumballSoldState(this);
        this.outOfGumballState = new OutOfGumballState();

        this.state = noQuarterState;
    }

    public void gumballSold() {
        gumball.gumballRelease();
    }

    @Override
    public void insertQuarter() {
        this.state.insertQuarter();
    }

    @Override
    public void ejectQuarter() {
        this.state.ejectQuarter();
    }

    @Override
    public void turnCrank() {
        this.state.turnCrank();
    }

    @Override
    public void dispense() {
        this.state.dispense();
    }

    @Override
    public String toString() {
        return  "\n" + name + ", Inc\n" +
                "Java-enabled Standing Gumball Model #2004\n" +
                "Inventory: " + gumball.getAmount() + " gumballs\n" +
                state + "\n";
    }

    public StateInterface getHasQuarterState() {
        return hasQuarterState;
    }

    public StateInterface getNoQuarterState() {
        return noQuarterState;
    }

    public StateInterface getGumballSoldState() {
        return gumballSoldState;
    }

    public StateInterface getOutOfGumballState() {
        return outOfGumballState;
    }

    public void setState(StateInterface state) {
        this.state = state;
    }

    public Gumball getGumball() {
        return gumball;
    }
}

//6510405865 Oanchana Changcharoen