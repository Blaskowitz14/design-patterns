package ru.blaskowitz.creational.factory;

import ru.blaskowitz.creational.factory.notification.Notification;
import ru.blaskowitz.creational.factory.notification.NotificationType;

public class FactoryUsage {
    public static void main(String[] args) {
        Notification email = NotificationFactory.createNotification(NotificationType.EMAIL);
        email.send("email");

        Notification push = NotificationFactory.createNotification(NotificationType.PUSH);
        push.send("push");

        Notification sms = NotificationFactory.createNotification(NotificationType.SMS);
        sms.send("sms");
    }
}
