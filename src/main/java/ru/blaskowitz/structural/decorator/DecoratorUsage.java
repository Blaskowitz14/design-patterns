package ru.blaskowitz.structural.decorator;

import ru.blaskowitz.structural.decorator.impl.Base64EncryptDecorator;
import ru.blaskowitz.structural.decorator.impl.TimestampDecorator;
import ru.blaskowitz.structural.decorator.message.Message;
import ru.blaskowitz.structural.decorator.message.impl.SimpleMessage;

public class DecoratorUsage {
    public static void main(String[] args) {
        Message message = new SimpleMessage("some message");

        Message decoratedMessage = new Base64EncryptDecorator(
                new TimestampDecorator(message));
        System.out.println(decoratedMessage.getContent());
    }
}
