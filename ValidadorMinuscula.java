
public class ValidadorMinuscula extends Validador {
    public ResValidador validar(String entrada) {
        boolean tieneMinus = false;

        for (int i = 0; i < entrada.length(); i++) {
            char c = entrada.charAt(i);
            tieneMinus |= java.lang.Character.isLowerCase(c);
            if (tieneMinus)
                break;
        }

        if (!tieneMinus)
            return new ResValidador(false, "Debe tener al menos una minuscula");
        return new ResValidador(true, "");
    }
}