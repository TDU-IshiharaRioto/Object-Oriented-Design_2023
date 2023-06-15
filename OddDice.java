public class OddDice extends AbstractDice {
    public OddDice () {
        super();
    }

    public void cast() {
        super.value = super.random.nextInt(3) * 2 + 1;
    }

    public int getValue () {
        return super.value;
    }
}
