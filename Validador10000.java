import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Validador10000 extends Validador {
    public ResValidador validar(String entrada) {
        boolean encontrado = false;
        try {
            File archivo = new File("password-list-top-10000.txt");
            Scanner reader = new Scanner(archivo);

            while (reader.hasNextLine()) {
                String pass = reader.nextLine();
                encontrado |= pass.equalsIgnoreCase(entrada);
                if (encontrado)
                    break;
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("no se encontro el archivo");
        }

        if (encontrado)
            return new ResValidador(false, "No debe pertenecer a las 10000 mas comunes");
        return new ResValidador(true, "");
    }
}
