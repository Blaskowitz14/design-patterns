package ru.blaskowitz.structural.adapter;

import lombok.RequiredArgsConstructor;
import ru.blaskowitz.structural.adapter.logger.LegacyLogger;
import ru.blaskowitz.structural.adapter.logger.Logger;

@RequiredArgsConstructor
public class LegacyLoggerAdapter implements Logger {

    private final LegacyLogger legacyLogger;

    @Override
    public void logInfo(String message) {
        legacyLogger.log("INFO", message);
    }

    @Override
    public void logError(String message) {
        legacyLogger.log("ERROR", message);
    }
}
