import java.util.List;
import java.util.ArrayList;

public class ValidadorContrasenia {

    static List<Validador> validadores = new ArrayList<Validador>();

    static void cargarValidadores() {
        validadores.add(new ValidadorMayuscula());
        validadores.add(new ValidadorMinuscula());
        validadores.add(new ValidadorNumero());
        validadores.add(new ValidadorLongitud());
        validadores.add(new Validador10000());
    }

    public static ResValidador validar(String entrada) {
        if (validadores.size() == 0)
            cargarValidadores();

        String errores = "";
        boolean validez = true;
        ResValidador temp;

        for (Validador validador : validadores) {
            temp = validador.validar(entrada);
            validez &= temp.esValida();
            errores += temp.tipoError() + "\n";
        }
        return new ResValidador(validez, errores);
    }

}
