package models;

public class Gumball {
    private int amount;
    private String flavor;

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

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }
}

//6510405865 Oanchana Changcharoen