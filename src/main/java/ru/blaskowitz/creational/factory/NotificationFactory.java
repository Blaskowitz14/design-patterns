package ru.blaskowitz.creational.factory;

import ru.blaskowitz.creational.factory.notification.impl.EmailNotification;
import ru.blaskowitz.creational.factory.notification.impl.PushNotification;
import ru.blaskowitz.creational.factory.notification.impl.SmsNotification;
import ru.blaskowitz.creational.factory.notification.Notification;
import ru.blaskowitz.creational.factory.notification.NotificationType;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class NotificationFactory {

    private static final Map<NotificationType, Supplier<Notification>> registry = new HashMap<>();

    static {
        register(NotificationType.EMAIL, EmailNotification::new);
        register(NotificationType.SMS, SmsNotification::new);
        register(NotificationType.PUSH, PushNotification::new);
    }

    public static void register(NotificationType type, Supplier<Notification> supplier) {
        registry.put(type, supplier);
    }

    public static void unregister(NotificationType type) {
        registry.remove(type);
    }

    public static void listAvailable() {
        System.out.println("Available notifications: " + registry.keySet());
    }

    public static Notification createNotification(NotificationType type) {
        Supplier<Notification> supplier = registry.get(type);

        if (supplier == null) {
            throw new IllegalArgumentException("Notification type " + type + " not found");
        }

        return supplier.get();
    }
}
