public class Spinner {
    private int value, numSpins, sum;
    private final int sections;

    public Spinner(int sections) {
        this.sections = sections;
    }

    public int getNumSpins() {
        return numSpins;
    }

    public int getSum() {
        return sum;
    }

    public int getValue() {
        return value;
    }

    public double getAverageSpin() {
        return (double) sum / numSpins;
    }

    public void spin() {
        value = 1 + (int) (Math.random() * sections);
        sum += value;
        numSpins++;
    }

}
