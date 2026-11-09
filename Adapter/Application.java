public class Application {
    private final Logger logger;

    public Application(Logger logger) {
        if (logger == null) {
            throw new IllegalArgumentException("O logger não pode ser nulo.");
        }
        this.logger = logger;
    }

    public void run() {
        logger.info("Iniciando aplicação");
        logger.error("Falha ao conectar no banco");
    }
}
