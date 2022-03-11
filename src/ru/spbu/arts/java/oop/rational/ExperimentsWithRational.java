package ru.spbu.arts.java.oop.rational;

public class ExperimentsWithRational {
    public static void main(String[] args) {
        Rational r = new Rational(1, 3);
        Rational r1 = new Rational(4, 6);
        Rational r2 = new Rational(1, 6);
        Rational r4 = new Rational(1, 3);


        System.out.println(r.toString());
        System.out.println(r1.toString());
        System.out.println(r.toDouble());

        System.out.println("_______");
        System.out.println("арифм.ф.");
        r.addInPlace(r2);
        System.out.println(r);
        System.out.println(r2);

        System.out.println("_______");
        Rational r3 = Rational.add(r4, r2);
        System.out.println(r3);
        System.out.println(r2);

        System.out.println("get");
        System.out.println(r2.getN() + "/" + r2.getD());

    }

}
