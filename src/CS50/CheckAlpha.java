package CS50;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckAlpha {
    public static Boolean Check(char a) throws IOException {
        Boolean bul = false;
        BufferedReader br = new BufferedReader (new FileReader("d:\\Java\\Projects\\src\\CS50\\Alphabet"));
        String str = br.readLine();
        for (int i=0; i<str.length();i++){
            //System.out.println(str.charAt(i));
            if (a==str.charAt(i)) {
                bul = true;
            }
        }
        return bul;
    }

    /*public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s= reader.readLine();
        char c = s.charAt(0);
        System.out.println(Check(c));
    }*/

}