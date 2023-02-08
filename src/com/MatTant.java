package com;

public class MatTant  extends Humans {

    String favoMat;

    void insert(int a, String n, float s, String m, String i ) {
        age = a;
        name = n;
        salary = s;
        favoMat = m;
        info = i;
    }

    void display() {
        System.out.println(age + " " + name + " " + salary + " " + favoMat + " "+ info);
    }
    @Override
    public void BytaNamn(String nyaNamnet) {
        System.out.println("Ditt nya namn är : " + nyaNamnet);
        name = nyaNamnet;
    }
}
