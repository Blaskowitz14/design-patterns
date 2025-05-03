package ru.blaskowitz.structural.bridge.logger;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import ru.blaskowitz.structural.bridge.destination.LogDestination;

@RequiredArgsConstructor(access = AccessLevel.PROTECTED)
public abstract class Logger {
    protected final LogDestination logDestination;

    public abstract void log(String message);
}
