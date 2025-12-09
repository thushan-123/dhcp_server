package logger;

import java.time.LocalDateTime;

public class Logger {

    private static Logger logger;

    private Logger() {}

    public static synchronized Logger getInstance() {
        if (logger == null) {
            logger = new Logger();
        }
        return logger;
    }

    public synchronized void log(LogStatus logStatus, String message) {
        System.out.println("[" + LocalDateTime.now() + "] "
                + "[" + logStatus.name() + "] "
                + message);
    }
}

