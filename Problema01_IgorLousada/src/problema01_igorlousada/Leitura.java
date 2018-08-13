
package problema01_igorlousada;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Leitura{
    public String entra(String label){
        System.out.println(label);
        InputStreamReader c = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(c);

        String s = "";
        try{
                s = cd.readLine();
        }
        catch(IOException erro){
                System.out.println("Erro de entrada: "+erro);
        }
        return s;
    }
}