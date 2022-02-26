package com.engeto.lekce2;

import java.time.LocalDate;
import java.util.Scanner;


public class Main {

    //metoda bez navratoveho typu a bez parametru
    public static void vypisMenu() {
        System.out.println("Menu");
        System.out.println("1. Scitani");
        System.out.println("2. Odecitani");
        System.out.println("3. Nasobeni");
        System.out.println("4. Deleni");
    }

    //metoda bez navratoveho typu s parametry
    public static void secti(int scitanec1,int scitanec2) {
        System.out.println(scitanec1 + "+" + scitanec2 + "=" + (scitanec1 + scitanec2));
    }

    //metoda s navratovym datovym typem bez parametru
    public static int nactiCislo() {
        Scanner sc = new Scanner(System.in); // toto se normalne dela jinak - demonstrace metod
        System.out.print("Zadej cislo: ");
        int cislo = sc.nextInt();
        return cislo;
    }

    //metoda s navratovym typem s parametry
    public static int odecti(int mensenec,int mensitel) {
        int vysledek = mensenec - mensitel;
        return vysledek;
    }


    public static void main(String[] args) {

//        vypisMenu();
//
//        int volba = nactiCislo();
//
//        if (volba == 1) {
//            System.out.println("Vybral jste scitani");
//            secti(nactiCislo(),nactiCislo());
//        }
//
//        if (volba == 2) {
//            System.out.println("Vybral jste odecitani");
//            int x = nactiCislo();
//            int y = nactiCislo();
//            System.out.println(x + "-" + y + "=" + odecti(x,y));
//
//        }



    }
}
