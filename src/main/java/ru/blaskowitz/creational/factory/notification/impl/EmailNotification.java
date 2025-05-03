package ru.blaskowitz.creational.factory.notification.impl;

import ru.blaskowitz.creational.factory.notification.Notification;

public class EmailNotification implements Notification {
    @Override
    public void send(String content) {
        System.out.println("EMAIL: " + content);
    }
}
