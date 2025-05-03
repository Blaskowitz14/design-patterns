package ru.blaskowitz.structural.decorator.message.impl;

import lombok.RequiredArgsConstructor;
import ru.blaskowitz.structural.decorator.message.Message;

@RequiredArgsConstructor
public class SimpleMessage implements Message {
    private final String content;

    @Override
    public String getContent() {
        return content;
    }
}
