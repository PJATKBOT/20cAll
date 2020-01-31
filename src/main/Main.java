package main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        System.out.println("Present your part");

        FileInputStream fis = null;

        try{
            fis = new FileInputStream("hamster.txt");

            StringBuilder sb = new StringBuilder();
            int c;

            while((c=fis.read()) != -1){
                sb.append((char)c);
            }
            System.out.println(sb);
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
