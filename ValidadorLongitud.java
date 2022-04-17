public class ValidadorLongitud extends Validador {
    public ResValidador validar(String entrada) {
        if (entrada.length() < 8)
            return new ResValidador(false, "Debe tener al menos 8 caracteres");
        return new ResValidador(true, "");
    }
}