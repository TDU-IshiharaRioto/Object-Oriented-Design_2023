public class Dice extends AbstractDice {
    public Dice () {
        super();
    }

    public void cast () {
        super.value = super.random.nextInt(6) + 1;
    }
}