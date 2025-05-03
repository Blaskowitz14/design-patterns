package ru.blaskowitz.structural.decorator.impl;

import ru.blaskowitz.structural.decorator.MessageDecorator;
import ru.blaskowitz.structural.decorator.message.Message;

import java.time.Instant;

public class TimestampDecorator extends MessageDecorator {
    public TimestampDecorator(Message message) {
        super(message);
    }

    @Override
    public String getContent() {
        return "[" + Instant.now() + "]" + message.getContent();
    }
}
