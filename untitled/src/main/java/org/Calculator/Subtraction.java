package org.Calculator;

public class Subtraction extends Addition {
    public int subtraction;

    public void subtraction() {

        subtraction =num1 - num2-num3-num4;
        System.out.println(subtraction);
    }

    @Override
    public String toString() {
        return "Subtraction{" +
                "subtraction=" + subtraction +
                '}';
    }
}
