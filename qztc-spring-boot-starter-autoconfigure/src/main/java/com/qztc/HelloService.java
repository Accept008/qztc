package com.qztc;

public class HelloService {
    Helloproperties helloproperties;

    public Helloproperties getHelloproperties() {
        return helloproperties;
    }

    public void setHelloproperties(Helloproperties helloproperties) {
        this.helloproperties = helloproperties;
    }

    public String sayHello(String pa){
        return helloproperties.getPrefix() + "-" + pa + "-" + helloproperties.getSuffix();
    }
}
