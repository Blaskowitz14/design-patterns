package ru.blaskowitz.creational.singleton;

public final class Singleton {
    private final String data;

    private Singleton(String data) {
        this.data = data;
    }

    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton("SINGLETON_INSTANCE");
    }

    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public String getData() {
        return data;
    }
}
