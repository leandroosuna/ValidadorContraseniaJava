import java.lang.System;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ValidadorApp {

    public static void main(String[] args) throws IOException {
        ResValidador resultado;

        do {
            System.out.println("");
            System.out.println("Ingrese contrasenia: ");

            String contrasenia = leerStringDeConsola();

            resultado = ValidadorContrasenia.validar(contrasenia);

            if (!resultado.esValida()) {
                System.out.println("[Contrasenia Invalida]");
                System.out.println(resultado.tipoError());
            }
        } while (!resultado.esValida());

        System.out.println("[Contrasenia Valida]");
    }

    static String leerStringDeConsola() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = "";
        try {
            s = br.readLine();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        return s;
    }

}
