package org.design_patterns;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Logger logger = Logger.getInstance();
        logger.logError("Error message");
        logger.logDebug("Debug message");
        logger.logInfo("Info message");
        logger.logWarn("Warn message");
    }
}