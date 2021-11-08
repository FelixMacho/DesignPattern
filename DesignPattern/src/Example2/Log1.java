package Example2;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Log1 implements CounterListener {
    private static final Logger LOGGER;

    static {
        LOGGER = Logger.getLogger(Log1.class.getSimpleName());
    }

    public void Log1() {
        try {
            FileHandler handler = new FileHandler("counter.log", true);
            handler.setEncoding("UTF-8");
            handler.setFormatter(new SimpleFormatter());
            LOGGER.addHandler(handler);

        } catch (IOException | SecurityException ex) {
            System.err.println(ex.getMessage());
        }
    }

    @Override
    public void counterChanged(CounterEvent e) {
        String message = String.format("Neuer Zahlerstand: %d", e.getNewVal());
        LOGGER.log(Level.INFO, message);
    }
}