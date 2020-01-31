package Szyfrowanie;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Szyfr {

    String filePath;
    StringBuilder sb;

    public Szyfr(String filePath){
        sb= new StringBuilder();
        readFile(sb,filePath);
    }

    //Wczytywanie z pliku
    public void readFile(StringBuilder sb, String filePath){
        try {
            FileReader fr = new FileReader(filePath);
            BufferedReader br= new BufferedReader(fr);
            String str;
            while ((str=br.readLine())!=null){
                sb.append(str).append("\n");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Wypisanie
    public void show(){
        System.out.println(sb);
    }

    //Szyfrowanie szyfrem cezara
    public void cript(){
        char c;
        //tmp: bedzie przechowywala zaszyfrowany tekst
        StringBuilder tmp= new StringBuilder();

        for (int i = 0; i <sb.length() ; i++) {

            //Sprawdzenie czy to jest bialy znak
            if(!Character.isWhitespace(sb.charAt(i))) {

                //Przesuniecie litery alfabetu o 3 w prawo
                c = (char) (sb.charAt(i) + 3);

                //Wyjatek X,Y,Z z powrotem na poczatek alfabetu
                if (Character.isUpperCase(sb.charAt(i))) {
                    if (c > 90) {
                        c = (char) (c - 26);
                    }
                }

                //Wyjatek Dla x,y,z z powrotem na poczatek alfabetu
                if (Character.isLowerCase(sb.charAt(i))) {
                    if (c > 122) {
                        c = (char) (c - 26);
                    }
                }
                tmp.append(c);
            }else{
                tmp.append(" ");
            }
        }
        //Nadpisanie zawartosci sb zawartoscia tmp
        sb= new StringBuilder(tmp);
    }

    //Deszyfrowanie
    public void decript(){
        char c;
        //tmp: bedzie przechowywala zaszyfrowany tekst
        StringBuilder tmp= new StringBuilder();
        for (int i = 0; i <sb.length() ; i++) {

            //Sprawdzenie czy to jest bialy znak
            if(!Character.isWhitespace(sb.charAt(i))){

                //Przesuniecie litery alfabetu o 3 w lewo
                c=(char)(sb.charAt(i)-3);

                //Wyjatek A,B,C z przejsciem na koniec alfabetu
                if(Character.isUpperCase(sb.charAt(i))){
                    if(c<65){
                        c= (char) (c+26);
                    }
                }

                //Wyjatek a,b,c z przejsciem na koniec alfabetu
                if(Character.isLowerCase(sb.charAt(i))){
                    if(c<97){
                        c= (char) (c+26);
                    }
                }
                tmp.append(c);
            }else{
                tmp.append(" ");
            }
        }
        //Nadpisanie zawartosci sb zawartoscia tmp
        sb= new StringBuilder(tmp);
    }
}
