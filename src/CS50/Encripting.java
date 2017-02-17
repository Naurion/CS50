package CS50;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by makarov.s on 17.02.2017.
 */
public class Encripting {
    public static String Encript(int key, String plaintext) throws IOException {
        char a;
        String ciphertext = "";
        for (int i=0; i<plaintext.length(); i++){
            a=plaintext.charAt(i);
            if (CheckAlpha.Check(a)){
                int c = (int)a + key;
                ciphertext+= ((char)c);
            }
            else
                ciphertext+=a;
        }
        return ciphertext;
    }

}
