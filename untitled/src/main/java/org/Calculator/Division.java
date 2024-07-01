package org.Calculator;

public class Division extends Addition {

        public int div;
public int result;


        public void division () {     // parameterised method
            div = num1 / num2/num3/num4;


            System.out.println(div);

        }

    @Override
    public String toString() {
        return "Division{" +
                "div=" + div +
                ", result=" + result +
                '}';
    }
}











