public class CronometroGiaPartitoException extends Exception {

    public CronometroGiaPartitoException(String message) {
        super(message);
    }

    public CronometroGiaPartitoException() {
        super("Cronometro già parito!");
    }

}
