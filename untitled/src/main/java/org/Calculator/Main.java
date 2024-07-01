package org.Calculator;

import java.util.Scanner;

public class Main{

public static void main(String[] args) {

    Addition a=new Addition();

    Division d=new Division();
    Multiplication m=new Multiplication();
    Percentage p=new Percentage();
    Subtraction s=new Subtraction();

    System.out.println("WELCOME TO THE TECH CALCULATOR");
    System.out.println("ENTER THE NUMBERS  (MAX LIMIT=4 NUMBERS)");
    Scanner scanner=new Scanner(System.in);

    System.out.println("Enter the Number1");
    String Number1=scanner.nextLine();
    a.num1=Integer.parseInt(Number1);
    s.num1=Integer.parseInt(Number1);
    m.num1=Integer.parseInt(Number1);
    p.num1=Integer.parseInt(Number1);

    System.out.println("Enter The Number2");
    String Number2=scanner.nextLine();
      a.num2=Integer.parseInt(Number2);
    s.num2=Integer.parseInt(Number2);
    m.num2=Integer.parseInt(Number2);
    p.num2=Integer.parseInt(Number2);

    System.out.println("Enter The Number3");
    String Number3=scanner.nextLine();
    a.num3=Integer.parseInt(Number2);
    s.num3=Integer.parseInt(Number2);
    m.num3=Integer.parseInt(Number2);
    p.num3=Integer.parseInt(Number2);

  System.out.println("Enter The Number 4");
    String Number4=scanner.nextLine();
    a.num4=Integer.parseInt(Number2);
    s.num4=Integer.parseInt(Number2);
    m.num4=Integer.parseInt(Number2);
    p.num4=Integer.parseInt(Number2);

    System.out.println("SELECT AND ENTER THE NUMBER TO IDENTIFY OPERATION YOU WANT TO PERFORM");
    System.out.println("ADDITION=1,SUBTRACTION=2,DIVISION=3,PERCENTAGE=4,MULTIPLICATION=5");
    String NUMBER=scanner.nextLine();
    a.numbers =Integer.parseInt(NUMBER);
    if(a.numbers==1) {

        a.addition();

        System.out.println(a);
    }
        else if(a.numbers==2){
         s.subtraction();
        System.out.println(s);
        }else if (a.numbers==3){

        d.division();

        System.out.println(d);
    }else if (a.numbers==4){
        p.percentage();
        System.out.println(p);
    }else if(a.numbers==5) {
        m.multiplication();
        System.out.println(m);}
        else
            System.out.println("PLEASE FOLLOW THE GUIDELINES TO GET THE RESULT");
    System.out.println("THANKS FOR USING TECH CALCULATOR");
    }

    @Override
    public String toString() {
        return "Main{}";
    }
}
