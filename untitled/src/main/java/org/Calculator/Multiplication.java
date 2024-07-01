package org.Calculator;

public class Multiplication extends Addition {
public int multiplication;
        public void multiplication() {
            multiplication= num1* num2*num3*num4;

            System.out.println(multiplication);
        }


    @Override
    public String toString() {
        return "Multiplication{" +
                "multiplication=" + multiplication +
                '}';
    }
}
















