package com.reflection.advancelevel.customloggingproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class CustomProxy implements InvocationHandler {
    private final Object target;
    public CustomProxy(Object target) {
        this.target = target;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result= method.invoke(target, args);
        return result;
    }
    //method to create a proxy instance for the target object
    public static Object createProxy(Object target) {
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new CustomProxy(target)
        );
    }

}
