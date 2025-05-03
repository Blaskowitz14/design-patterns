package ru.blaskowitz.structural.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class CachingInvocationHandler implements InvocationHandler {
    private final Object target;
    private final Map<String, Object> cache = new HashMap<>();

    public CachingInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Calling method: " + method);
        if (method.getName().equals("getData")
        && args.length == 1
        && args[0] instanceof String) {
            String key = (String) args[0];
            return cache.computeIfAbsent(key, k-> {
                try {
                    System.out.println("miss");
                    Object result = method.invoke(target, args);
                    System.out.println("Caching: " + result);
                    return result;
                } catch(Throwable e) {
                    throw new RuntimeException(e);
                }
            });
        }
        return method.invoke(target, args);
    }
}
