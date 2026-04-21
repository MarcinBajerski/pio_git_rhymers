package edu.kis.vh.nursery;

/**
 * Klasa DefaultCountingOutRhymer służy do przechowywania i wyliczania rymowanek przy użyciu tablicy.
 */
public class DefaultCountingOutRhymer {

    public static final int STACK_SIZE = 12;
    public static final int EMPTY_STACK_VAL = -1;
    public static final int FULL_STACK_VAL = 11;

    private int[] numbers = new int[STACK_SIZE];

    public int total = EMPTY_STACK_VAL;

    /**
     * Dodaje nową wartość na koniec wyliczanki (na wierzch stosu).
     * * @param in wartość liczbowa, która ma zostać dodana
     */
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    /**
     * Sprawdza, czy wyliczanka (stos) jest obecnie pusta.
     * * @return true jeśli wyliczanka jest pusta, w przeciwnym razie false
     */
    public boolean callCheck() {
        return total == EMPTY_STACK_VAL;
    }

    /**
     * Sprawdza, czy wyliczanka (stos) osiągnęła maksymalną pojemność i nie przyjmie więcej wartości.
     * * @return true jeśli wyliczanka jest pełna, w przeciwnym razie false
     */
    public boolean isFull() {
        return total == FULL_STACK_VAL;
    }

    /**
     * Zwraca ostatnio dodaną wartość (z wierzchu stosu) bez jej usuwania.
     * * @return ostatnio dodana liczba lub wartość EMPTY_STACK_VAL, jeśli stos jest pusty
     */
    protected int peekaboo() {
        if (callCheck())
            return EMPTY_STACK_VAL;
        return numbers[total];
    }

    /**
     * Pobiera i usuwa ostatnio dodaną wartość z wyliczanki (zdejmuje ze stosu).
     * * @return zdjęta liczba lub wartość EMPTY_STACK_VAL, jeśli stos jest pusty
     */
    public int countOut() {
        if (callCheck())
            return EMPTY_STACK_VAL;
        return numbers[total--];
    }
}