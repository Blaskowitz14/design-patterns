package ru.blaskowitz.structural.proxy;

import ru.blaskowitz.structural.proxy.jdk.CachingInvocationHandler;
import ru.blaskowitz.structural.proxy.service.DataService;
import ru.blaskowitz.structural.proxy.service.impl.RealDataService;
import ru.blaskowitz.structural.proxy.simple.CachingDataServiceProxy;

import java.lang.reflect.Proxy;

public class ProxyUsage {
    public static void main(String[] args) {
        DataService realService = new RealDataService();
        DataService simpleProxy = new CachingDataServiceProxy(realService);

        System.out.println(simpleProxy.getData("1234"));
        System.out.println(simpleProxy.getData("1234"));

        DataService jdkProxy = (DataService) Proxy.newProxyInstance(
                DataService.class.getClassLoader(),
                new Class<?>[]{DataService.class},
                new CachingInvocationHandler(realService));

        System.out.println(jdkProxy.getData("1234"));
        System.out.println(jdkProxy.getData("1234"));
    }
}
