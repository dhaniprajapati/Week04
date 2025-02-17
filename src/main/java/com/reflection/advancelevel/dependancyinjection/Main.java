package com.reflection.advancelevel.dependancyinjection;
public class Main {

    public static void main(String[] args) {
        DIContainer diContainer = new DIContainer();
        //register an instance of client to be injected
        diContainer.register(Service.class, new ServiceImpl());
        //create a Client instance and inject dependencies
        Client client = new Client();
        diContainer.injectDependencies(client);
        client.doWork();
    }
}
