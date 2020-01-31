package main;

import Szyfrowanie.Szyfr;

public class Main {
    public static void main(String[] args) {
        System.out.println("Present your part\n");
        Szyfr s= new Szyfr("hamster.txt");
        s.cript();
        s.show();
        s.decript();
        s.show();
    }
}
