package ru.blaskowitz.structural.bridge.logger.impl;

import ru.blaskowitz.structural.bridge.destination.LogDestination;
import ru.blaskowitz.structural.bridge.logger.Logger;

public class InfoLogger extends Logger {

    public InfoLogger(LogDestination destination) {
        super(destination);
    }

    @Override
    public void log(String message) {
        logDestination.write("[Info] " + message);
    }
}
