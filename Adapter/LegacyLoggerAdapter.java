public class LegacyLoggerAdapter implements Logger {
    private final LegacyLogger legacyLogger;

    public LegacyLoggerAdapter(LegacyLogger legacyLogger) {
        if (legacyLogger == null) {
            throw new IllegalArgumentException("O logger legado não pode ser nulo.");
        }
        this.legacyLogger = legacyLogger;
    }

    @Override
    public void info(String message) {
        legacyLogger.log("INFO", message);
    }

    @Override
    public void error(String message) {
        legacyLogger.log("ERROR", message);
    }
}
