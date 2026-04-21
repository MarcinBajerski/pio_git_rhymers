package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int STACK_CAPACITY = 12;
    public static final int EMPTY_RHYMER_INDICATOR = -1;
    public final int TOTAL_INIT_VAL = -1;
    public static final int FULL_RHYMER_INDICATOR = STACK_CAPACITY - 1;

    private final int[] NUMBERS = new int[STACK_CAPACITY];

    public int total = TOTAL_INIT_VAL;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    public boolean callCheck() {
        return total == TOTAL_INIT_VAL;
    }

    public boolean isFull() {
        return total == FULL_RHYMER_INDICATOR;
    }

    protected int peekaboo() {
        if (callCheck())
            return EMPTY_RHYMER_INDICATOR;
        return NUMBERS[total];
    }

    public int countOut() {
        if (callCheck())
            return EMPTY_RHYMER_INDICATOR;
        return NUMBERS[total--];
    }

}
