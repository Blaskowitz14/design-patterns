package ru.blaskowitz.structural.proxy.service.impl;

import lombok.SneakyThrows;
import ru.blaskowitz.structural.proxy.service.DataService;

public class RealDataService implements DataService {

    @Override
    @SneakyThrows
    public String getData(String key) {
        Thread.sleep(1000);
        return "data " + key;
    }
}
