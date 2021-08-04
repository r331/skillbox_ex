package ru.skillbox.ex4;

import static ru.skillbox.ex4.Main4.divide100byInt;

public class Main5 {
    public static void main(String[] args) {
    }

    /**
     * @param a - int
     * @throws InvalidZeroParameterException выбрасывается если входной параметр равен 0
     */
    static void openConnections(int a) throws InvalidZeroParameterException {
        if (a == 0)
            throw new InvalidZeroParameterException();
        //....
        divide100byInt(a);
    }
}