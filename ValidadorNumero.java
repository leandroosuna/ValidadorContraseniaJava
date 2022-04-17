public class ValidadorNumero extends Validador {
    public ResValidador validar(String entrada) {
        boolean tieneNumero = false;

        for (int i = 0; i < entrada.length(); i++) {
            char c = entrada.charAt(i);
            tieneNumero |= java.lang.Character.isDigit(c);
            if (tieneNumero)
                break;
        }

        if (!tieneNumero)
            return new ResValidador(false, "Debe tener al menos un numero");
        return new ResValidador(true, "");
    }
}
