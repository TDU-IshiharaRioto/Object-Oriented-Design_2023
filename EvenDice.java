public class EvenDice extends AbstractDice {
    public EvenDice () {
        super();
    }

    public void cast () {
        super.value = (super.random.nextInt(3) + 1) * 2;
    }

    public int getValue () {
        return super.value;
    }
}
