public class DataNonValidaException extends RuntimeException {
    public DataNonValidaException(String message) {
        super(message);
    }
    public DataNonValidaException() {
        super("La data non è valida!");
    }
}
