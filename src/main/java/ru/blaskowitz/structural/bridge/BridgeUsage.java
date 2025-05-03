package ru.blaskowitz.structural.bridge;

import ru.blaskowitz.structural.bridge.destination.LogDestination;
import ru.blaskowitz.structural.bridge.destination.impl.ConsoleLogDestination;
import ru.blaskowitz.structural.bridge.destination.impl.FileLogDestination;
import ru.blaskowitz.structural.bridge.logger.Logger;
import ru.blaskowitz.structural.bridge.logger.impl.ErrorLogger;
import ru.blaskowitz.structural.bridge.logger.impl.InfoLogger;

public class BridgeUsage {
    public static void main(String[] args) {
        LogDestination consoleDestination = new ConsoleLogDestination();
        LogDestination fileDestination = new FileLogDestination();

        Logger infoConsoleLogger = new InfoLogger(consoleDestination);
        infoConsoleLogger.log("app started");
        Logger errorConsoleLogger = new ErrorLogger(consoleDestination);
        errorConsoleLogger.log("error");

        Logger infoFileLogger = new InfoLogger(fileDestination);
        infoFileLogger.log("app started");
        Logger errorFileLogger = new ErrorLogger(fileDestination);
        errorFileLogger.log("error");
    }
}
