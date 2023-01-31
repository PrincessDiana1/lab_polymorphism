package org.example;

public class IceCreamCake extends Cake {

    public IceCreamCake(String name){
        super(name);
    }

    @Override
    public String baseTexture(){
        return "Hard";
    }
}
