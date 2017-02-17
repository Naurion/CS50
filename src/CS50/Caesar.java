package CS50;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import Naurion.InOut;

/**
 * Created by makarov.s on 17.02.2017.
 */
public class Caesar {
    public static void main(String[] args) throws IOException {
        int key = Integer.parseInt(InOut.read());
        String plaintext = InOut.read();
        InOut.println(Encripting.Encript(key, plaintext));
    }
}
