public class Dice {
    private int numSides;
    private int lastRoll;
    private int rolls;

    public Dice(int sides) {
        numSides = sides;
    }

    public String toString() {
        return "Number of Sides: %d\nLast Roll: %d\nNumber of Rolls: %d\n".formatted(numSides, lastRoll, rolls);
    }

    public int getNumSides() {
        return numSides;
    }

    public int getLastRoll() {
        return lastRoll;
    }

    public int getRolls() {
        return rolls;
    }

    public void setNumSides(int numSides) {
        this.numSides = numSides;
    }

    public void roll() {
        lastRoll = 1 + (int) (Math.random() * numSides);
        rolls++;
    }
}
