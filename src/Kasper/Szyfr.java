package Kasper;

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

    public void show(){
        System.out.println(sb);
    }

    public void cript(){
        char c;
        StringBuilder tmp= new StringBuilder();
        //String str=sb.toString();
        for (int i = 0; i <sb.length() ; i++) {
            if(!Character.isWhitespace(sb.charAt(i))) {
                c = (char) (sb.charAt(i) + 3);
                //Wyjatek Dla Wielkich Liter
                if (sb.charAt(i) > 64 && sb.charAt(i) < 91) {
                    if (c > 90) {
                        c = (char) (c - 26);
                    }
                }
                //Wyjatek Dla Malych Liter
                if (sb.charAt(i) > 96 && sb.charAt(i) < 123) {
                    if (c > 122) {
                        c = (char) (c - 26);
                    }
                }

                tmp.append(c);
            }
        }
        sb= new StringBuilder(tmp);
    }

    public void decript(){
        char c;
        StringBuilder tmp= new StringBuilder();

    }


}
