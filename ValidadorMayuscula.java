
public class ValidadorMayuscula extends Validador {
    public ResValidador validar(String entrada) {
        boolean tieneMayus = false;

        for (int i = 0; i < entrada.length(); i++) {
            char c = entrada.charAt(i);
            tieneMayus |= java.lang.Character.isUpperCase(c);
            if (tieneMayus)
                break;
        }

        if (!tieneMayus)
            return new ResValidador(false, "Debe tener al menos una mayuscula");
        return new ResValidador(true, "");
    }
}