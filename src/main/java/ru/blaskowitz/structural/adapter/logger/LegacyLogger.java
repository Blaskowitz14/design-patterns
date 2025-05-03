package ru.blaskowitz.structural.adapter.logger;

public class LegacyLogger {
    public void log(String severity, String message) {
        System.out.printf("[%s]: %s%n", severity, message);
    }
}
