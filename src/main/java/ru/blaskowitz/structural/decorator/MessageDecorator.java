package ru.blaskowitz.structural.decorator;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import ru.blaskowitz.structural.decorator.message.Message;

@RequiredArgsConstructor(access = AccessLevel.PROTECTED)
public abstract class MessageDecorator implements Message {
    protected final Message message;
}
