package exceptions;

public class NaoAutorizadoException extends RuntimeException {
    private final String mensagem;

    public NaoAutorizadoException(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String getMessage() {
        return mensagem;
    }


}
