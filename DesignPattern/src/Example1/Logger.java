package Example1;

public final class Logger {
    private static Logger logger;

    private Logger() {}

    public static synchronized Logger getLogger() {
        if(Logger.logger == null) {
            Logger.logger = new Logger();
        }
        return Logger.logger;
    }
}
