public class C5_20 {
    public static void main(String[] args) {
        Castable[] list = {new Dice(), new EvenDice(), new OddDice()};
        for (Castable castable : list) {
            castable.cast();
            System.out.println(castable.getValue());
        }
    }
}
