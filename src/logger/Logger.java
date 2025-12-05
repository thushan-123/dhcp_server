package logger;

import javax.sound.midi.SoundbankResource;
import java.time.LocalDateTime;

public class Logger {

    public Logger logger;
    private LocalDateTime dateTime;
    private String message;
    private LogStatus logStatus;

    private Logger() {
    }
    public synchronized void log(LogStatus logStatus, String message) {
        this.logStatus = logStatus;
        this.message = message;

        if (this.logger == null) {
            this.logger = new Logger();
            output();
        }else {
            this.logger.output();
        }
    }

    public void output(){
        System.out.println("[" + LocalDateTime.now() + "] " + "[" + this.logStatus.name()+ "] " + this.message);
    }


}
