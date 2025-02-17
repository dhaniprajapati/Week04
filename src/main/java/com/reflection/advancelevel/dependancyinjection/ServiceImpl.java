package com.reflection.advancelevel.dependancyinjection;

public class ServiceImpl implements Service {
    @Override
    public void serve() {
        System.out.println("Service is serving...");
    }
}
