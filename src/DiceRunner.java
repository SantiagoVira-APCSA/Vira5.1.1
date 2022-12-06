public class Main {
    public static void main(String[] args) {
        Dice d6 = new Dice(6);
        d6.roll();
        d6.roll();
        System.out.println(d6);

        Dice die = new Dice(12);
        System.out.println(die.getNumSides());
        die.setNumSides(20);
        System.out.println(die.getNumSides());
        System.out.println(die.getRolls());
        die.roll();
        System.out.println(die.getRolls());
        System.out.println(die.getLastRoll());
        die.roll();
        System.out.println(die.getLastRoll());

    }
}