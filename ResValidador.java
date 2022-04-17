public class ResValidador {

    boolean valida;
    String tipoError;

    public ResValidador(boolean v, String t) {
        valida = v;
        tipoError = t;
    }

    public boolean esValida() {
        return valida;
    }

    public String tipoError() {
        return tipoError;
    }
}
