package com.reflection.advancelevel.customloggingproxy;

public class Main {
    public static void main(String[] args) {
        //create  object
        Greetings greeting = new Hello();
        //create the proxy object
        Greetings proxyGreeting = (Greetings) CustomProxy.createProxy(greeting);
        //use the proxy object to invoke the method
        proxyGreeting.sayHello();
    }
}

