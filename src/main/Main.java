package main;

import Kasper.Szyfr;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        System.out.println("Present your part");
        Szyfr s= new Szyfr("hamster.txt");
        s.cript();
        s.show();
    }
}
