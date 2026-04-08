package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int STACK_CAPACITY = 12;
    public static final int EMPTY_RHYMER_INDICATOR = -1;
    public static final int FULL_RHYMER_INDICATOR = 11;

    private int[] numbers = new int[STACK_CAPACITY];

    public int total = EMPTY_RHYMER_INDICATOR;

    @Override
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    @Override
    public boolean callCheck() {
        return total == EMPTY_RHYMER_INDICATOR;
    }

    @Override
    public boolean isFull() {
        return total == FULL_RHYMER_INDICATOR11;
    }

    @Override
    protected int peekaboo() {
        if (callCheck())
            return EMPTY_RHYMER_INDICATOR;
        return numbers[total];
    }

    @Override
    public int countOut() {
        if (callCheck())
            return EMPTY_RHYMER_INDICATOR;
        return numbers[total--];
    }

}
