package Singleton;

import java.io.FileWriter;
import java.io.IOException;

public class Logger {

    // Eagerly initialize the singleton instance
    private static final Logger INSTANCE = new Logger();

    private FileWriter fileWriter;

    // Private constructor to prevent external instantiation
    private Logger() {
        try {
            // Open the file for appending if it exists, or create a new file if it doesn't exist
            fileWriter = new FileWriter("log.txt", true);
        } catch (IOException e) {
            // Log the error if the file could not be opened
            e.printStackTrace();
        }
    }

    // Returns the singleton instance
    public static Logger getInstance() {
        return INSTANCE;
    }

    // Writes a message to the log file
    public void log(String message) {
        try {
            // Append the message to the end of the file and flush the writer to ensure the message is written immediately
            fileWriter.write(message + "\n");
            fileWriter.flush();
        } catch (IOException e) {
            // Log the error if the message could not be written
            e.printStackTrace();
        }
    }

    // Closes the file writer when logging is complete
    public void close() {
        try {
            fileWriter.close();
        } catch (IOException e) {
            // Log the error if the file writer could not be closed
            e.printStackTrace();
        }
    }

}
