package models;

public class Gumball {
    private int amount;

    public Gumball(int amount) {
        this.amount = amount;
    }

    public void gumballRelease() {
        setAmount(getAmount() - 1);
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}

//6510405865 Oanchana Changcharoen