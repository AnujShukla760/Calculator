package org.Calculator;

public class Percentage extends  Addition {
      double  percentage;
      double num1;
      double num2;
      double perc;
    public void percentage() {
         percentage =   ( num1 / num2)  ;
        perc=percentage*100;
        System.out.println(perc);

    }

    @Override
    public String toString() {
        return "Percentage{" +
                "percentage=" + percentage +
                ", num1=" + num1 +
                ", num2=" + num2 +
                ", perc=" + perc +
                '}';
    }
}

