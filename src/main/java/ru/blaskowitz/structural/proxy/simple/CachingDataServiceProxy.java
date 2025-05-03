package ru.blaskowitz.structural.proxy.simple;

import ru.blaskowitz.structural.proxy.service.DataService;

import java.util.HashMap;
import java.util.Map;

public class CachingDataServiceProxy implements DataService {
    private final DataService dataService;
    private final Map<String, String> cache = new HashMap<>();

    public CachingDataServiceProxy(DataService dataService) {
        this.dataService = dataService;
    }

    @Override
    public String getData(String key) {
        System.out.println("request for key: " + key);

        return cache.computeIfAbsent(key, k -> {
            System.out.println("miss");
            String data = dataService.getData(key);
            System.out.println("cached: " + data);
            return data;
        });
    }
}
