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
                //System.out.println(c);
                if (c>90 && c<97){
                    c = 64+(c-90);

                }
                if(c>122){
                    c = 96+(c-122);
                }
                ciphertext+= ((char)c);
            }
            else
                ciphertext+=a;
        }
        return ciphertext;
    }

}
