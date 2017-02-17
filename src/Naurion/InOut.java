package Naurion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by makarov.s on 17.02.2017.
 */
public class InOut {
    public static void println(String s) throws IOException {
        System.out.println(s);
    }

    public static String read() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        return s;
    }
}
