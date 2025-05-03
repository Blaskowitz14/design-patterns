package ru.blaskowitz.creational.factory.notification.impl;

import ru.blaskowitz.creational.factory.notification.Notification;

public class PushNotification implements Notification {
    @Override
    public void send(String content) {
        System.out.println("PUSH: " + content);
    }
}
