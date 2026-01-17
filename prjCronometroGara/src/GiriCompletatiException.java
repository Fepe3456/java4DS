public class GiriCompletatiException extends RuntimeException {

    public GiriCompletatiException(String message) {
        super(message);
    }

    public GiriCompletatiException() {
        super("Tutti i giri sono già stati completati!");
    }

}
