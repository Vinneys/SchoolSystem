package com;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    static  ArrayList<Student> students = new ArrayList<Student>();
    static  ArrayList<Larare> Teach = new ArrayList<Larare>();
    static  ArrayList<MatTant> FoodLady = new ArrayList<MatTant>();


    static Scanner scan = new Scanner(System.in);
    static Scanner scan2 = new Scanner(System.in);



    public static void main(String[] args) {

        boolean stop = false;
        for (int i = 0; i < 3; i++) {
            students.add(new Student());
        }

        for (int i = 0; i < 3; i++) {
            Teach.add(new Larare());
        }

        for (int i = 0; i < 3; i++) {
            FoodLady.add(new MatTant());
        }

        students.get(0).insert(16, "Xuan", 1000, 170, " hej, Jag tycker om att spela fotboll och programmera");
        students.get(1).insert(17, "Mirel", 2000, 200, " hej, Jag tycker om att göra objekt i CAD");
        students.get(2).insert(18, "Sam", 3000, 200, " Hejsan svejsan");

        Teach.get(0).insert(30, "Ehab", 35000, 170, "hej ");
        Teach.get(1).insert(31, "Fredrik", 29000, 200, "hej");
        Teach.get(2).insert(32, "Linn", 30000, 200, "hej");

        FoodLady.get(0).insert(50, "Rose", 50333, "hej", "hej jag gillar att äta");
        FoodLady.get(1).insert(50, "Rose", 50333, "hej", "hej jag gillar att äta");
        FoodLady.get(2).insert( 30, "Raman", 50331, "hej", "hej jag gillar att äta");

        while (!stop) {
            System.out.println("------------------------ ");
            System.out.println("Välkommen till skolan, Vad vill du göra? ");
            System.out.println(" 1 -  Byta namn på personerna ");
            System.out.println(" 2 -  Visa personernas information");
            System.out.println(" 3 -  Avsluta ");
            int ansr = scan.nextInt();
            switch (ansr) {
                case 1 -> {
                    for (int i = 0; i < 3; i++) {
                        students.get(i).display();
                    }
                    for (int i = 0; i < 3; i++) {
                        Teach.get(i).display();
                    }
                    for (int i = 0; i < 3; i++) {
                        FoodLady.get(i).display();
                    }
                    Bytnamn();
                }
                case 2 -> {
                    System.out.println("Vems information vill du se? Stud/teach/FL?");
                    String svar = scan2.nextLine();
                    switch (svar) {
                        case "stud","Stud" -> {
                            for (int i = 0; i < 3; i++) {
                                students.get(i).display();
                            }
                        }
                        case "teach", "Teach" -> {
                            for (int i = 0; i < 3; i++) {
                                Teach.get(i).display();
                            }

                        }
                        case "fl", "FL" -> {
                            for (int i = 0; i < 3; i++) {
                                FoodLady.get(i).display();
                            }

                        }
                    }
                }
                case 3 -> {
                    System.out.println("Okej, hejdå..");
                    stop = true;

                }
            }
        }
    }
    static void Bytnamn() {
        System.out.println("Vem vill du byta namn på?");
        String namn = scan2.nextLine();
        System.out.println("vad vill du byta till?");
        String ansr = scan2.nextLine();
        for (int j = 0; j < students.size(); j++) {
            if (students.get(j).getName().equalsIgnoreCase(namn)) {
                students.get(j).BytaNamn(ansr);
                students.get(j).display();
            }
        }

        for (int j = 0; j < Teach.size(); j++) {
            if (Teach.get(j).getName().equalsIgnoreCase(namn)) {
                Teach.get(j).BytaNamn(ansr);
                Teach.get(j).display();
            }
        }

        for (int j = 0; j < FoodLady.size(); j++) {
            if (FoodLady.get(j).getName().equalsIgnoreCase(namn)) {
                FoodLady.get(j).BytaNamn(ansr);
                FoodLady.get(j).display();
            }
        }
    }

}
