package com.annotation.practiceproblems.advancelevel.customcachingsystem;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class CachingHandler implements InvocationHandler {
    private final Object target;

    public CachingHandler(Object target) {
        this.target = target;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // Check if the method is annotated with @CacheResult
        if (method.isAnnotationPresent(CacheResult.class)) {
            // Convert method arguments to a string key
            String key = generateCacheKey(method, args);
            // Check if result is already cached
            if (Cache.containsKey(key)) {
                return Cache.get(key);
            } else {
                // Invoke the actual method
                Object result = method.invoke(target, args);
                // Store the result in the cache
                Cache.put(key, result);
                return result;
            }
        } else {
            // If method isn't annotated with @CacheResult execute normally
            return method.invoke(target, args);
        }
    }
    // Generate a key based on the method and its arguments
    private String generateCacheKey(Method method, Object[] args) {
        StringBuilder keyBuilder = new StringBuilder(method.getName());
        if (args != null) {
            for (Object arg : args) {
                keyBuilder.append("-").append(arg.toString());
            }
        }
        return keyBuilder.toString();
    }
    // method to create a proxy that applies caching
    public static Object createProxy(Object target) {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(), new CachingHandler(target));
    }
}
