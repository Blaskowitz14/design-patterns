package ru.blaskowitz.creational.factory.notification.impl;

import ru.blaskowitz.creational.factory.notification.Notification;

public class SmsNotification implements Notification {
    @Override
    public void send(String content) {
        System.out.println("SMS: " + content);
    }
}
