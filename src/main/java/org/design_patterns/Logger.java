package org.design_patterns;

public class Logger {

    private LogLevel level;
    private static Logger instance;

    // private constructor
    private Logger() {}

    public void setLevel(LogLevel level) {
        this.level = level;
    }

    public void logError(String message) {
        setLevel(LogLevel.ERROR);
        if (level.ordinal() <= LogLevel.ERROR.ordinal())
            System.out.println("ERROR: " + message + " with type "+ level);
    }

    public void logDebug(String message) {
        setLevel(LogLevel.DEBUG);
        if (level.ordinal() <= LogLevel.DEBUG.ordinal())
            System.out.println("Debug: " + message + " with type "+ level);
    }

    public void logWarn(String message) {
        setLevel(LogLevel.WARNING);
        if (level.ordinal() <= LogLevel.WARNING.ordinal())
            System.out.println("Warn: " + message + " with type "+ level);
    }

    public void logInfo(String message) {
        setLevel(LogLevel.INFO);
        if (level.ordinal() <= LogLevel.INFO.ordinal())
            System.out.println("Info: " + message + " with type "+ level);
    }

    public static Logger getInstance(){
        if (instance == null){
            synchronized (Logger.class){
                if (instance == null){
                     instance = new Logger();
                }
            }
        }
        return instance;
    }
}
