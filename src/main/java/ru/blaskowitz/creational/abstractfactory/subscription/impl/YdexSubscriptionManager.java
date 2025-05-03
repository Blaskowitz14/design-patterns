package ru.blaskowitz.creational.abstractfactory.subscription.impl;

import ru.blaskowitz.creational.abstractfactory.subscription.SubscriptionManager;

public class YdexSubscriptionManager implements SubscriptionManager {

    @Override
    public void createSubscription() {
        System.out.println("Creating Ydex Subscription");
    }
}