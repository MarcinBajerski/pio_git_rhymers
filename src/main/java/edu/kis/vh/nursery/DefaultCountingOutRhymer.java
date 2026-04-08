package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int STACK_CAPACITY = 12;
    public static final int EMPTY_RHYMER_INDICATOR = -1;
    public static final int FULL_RHYMER_INDICATOR = 11;

    private int[] numbers = new int[STACK_CAPACITY];

    public int total = EMPTY_RHYMER_INDICATOR;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == EMPTY_RHYMER_INDICATOR;
    }

    public boolean isFull() {
        return total == FULL_RHYMER_INDICATOR11;
    }

    protected int peekaboo() {
        if (callCheck())
            return EMPTY_RHYMER_INDICATOR;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return EMPTY_RHYMER_INDICATOR;
        return numbers[total--];
    }

}
