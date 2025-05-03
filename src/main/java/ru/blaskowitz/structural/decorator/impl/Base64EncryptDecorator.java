package ru.blaskowitz.structural.decorator.impl;

import ru.blaskowitz.structural.decorator.MessageDecorator;
import ru.blaskowitz.structural.decorator.message.Message;

import java.util.Base64;


public class Base64EncryptDecorator extends MessageDecorator {
    public Base64EncryptDecorator(Message message) {
        super(message);
    }

    @Override
    public String getContent() {
        return Base64.getEncoder().encodeToString(message.getContent().getBytes());
    }
}
