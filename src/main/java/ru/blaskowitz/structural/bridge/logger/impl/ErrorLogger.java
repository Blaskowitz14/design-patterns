package ru.blaskowitz.structural.bridge.logger.impl;

import ru.blaskowitz.structural.bridge.destination.LogDestination;
import ru.blaskowitz.structural.bridge.logger.Logger;

public class ErrorLogger extends Logger {

    public ErrorLogger(LogDestination destination) {
        super(destination);
    }

    @Override
    public void log(String message) {
        logDestination.write("[Error] " + message);
    }
}
