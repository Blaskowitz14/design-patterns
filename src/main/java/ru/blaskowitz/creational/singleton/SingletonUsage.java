package ru.blaskowitz.creational.singleton;

public class SingletonUsage {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        System.out.println(instance.getData());
    }
}
