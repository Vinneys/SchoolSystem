package com;

public class Student extends Humans {



    void display() {
        System.out.println(age + " " + name + " " + salary + " " + height + "" + info);
    }

    void prata() {
        System.out.println("Hej mitt namn är " + name + " och är " + age + " gammal.");
    }

    @Override
    public void BytaNamn(String nyaNamnet) {
        System.out.println("Ditt nya namn är : " + nyaNamnet);
        name = nyaNamnet;
    }
}

