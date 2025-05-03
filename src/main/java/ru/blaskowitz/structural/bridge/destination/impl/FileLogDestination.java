package ru.blaskowitz.structural.bridge.destination.impl;

import ru.blaskowitz.structural.bridge.destination.LogDestination;

public class FileLogDestination implements LogDestination {

    @Override
    public void write(String message) {
        System.out.println("[File]: " + message);
    }
}
