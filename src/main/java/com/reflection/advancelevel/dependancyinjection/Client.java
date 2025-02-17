package com.reflection.advancelevel.dependancyinjection;
public class Client {

    @Inject
    private Service service;

    public void doWork() {
        service.serve();
    }
}
