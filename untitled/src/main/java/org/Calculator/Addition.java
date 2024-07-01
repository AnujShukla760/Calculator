package org.Calculator;

public class Addition{

    public int num1;
   public int num2;
  public int num3;
 public int num4;
 public double numbers;

    public int addition;

    public void addition() {  // method overloading
        addition = num1 + num2 +num3+num4;

        System.out.println(addition);
    }

    @Override
    public String toString() {
        return "Addition{" +
                "num1=" + num1 +
                ", num2=" + num2 +
                ", num3=" + num3 +
                ", num4=" + num4 +
                ", numbers=" + numbers +
                ", addition=" + addition +
                '}';
    }
}







