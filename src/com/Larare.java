package com;

public class Larare extends Humans{


    void display() {
        System.out.println(age + " " + name + " " + salary + " " + height + " " + info);
    }
    @Override
    public void BytaNamn(String nyaNamnet) {
        System.out.println("Ditt nya namn är : " + nyaNamnet);
        name = nyaNamnet;
    }
}
