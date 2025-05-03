package ru.blaskowitz.structural.adapter;

import ru.blaskowitz.structural.adapter.logger.LegacyLogger;
import ru.blaskowitz.structural.adapter.logger.Logger;

public class AdapterUsage {
    public static void main(String[] args) {
        Logger logger = new LegacyLoggerAdapter(new LegacyLogger());
        logger.logInfo("Starting application");
        logger.logError("Something went wrong");
    }
}
