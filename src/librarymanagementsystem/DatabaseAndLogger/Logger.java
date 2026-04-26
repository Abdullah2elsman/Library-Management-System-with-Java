package librarymanagementsystem.DatabaseAndLogger;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

public class Logger {

    private static Logger instance;
    private final PrintWriter writer;

    private Logger() {
        try {
            writer = new PrintWriter(new FileWriter("application.log", true),true);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to initialize logger!");
        }
    }

    public static Logger getInstance() {
        if (instance == null) {
            synchronized (Logger.class) {
                if (instance == null) {
                    instance = new Logger();
                }
            }
        }
        return instance;
    }

    public void log(String message) {
        writer.println(LocalDateTime.now() + " - " + message);
        writer.flush();
    }
}
