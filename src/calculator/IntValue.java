package calculator;

public class IntValue implements Value {

    private int value;

    public IntValue(int value) {
        this.value = value;
    }

    @Override
    public int get() {
        return value;
    }
}
