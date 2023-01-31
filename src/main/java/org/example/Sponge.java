package org.example;

public class Sponge extends Cake {

    private boolean softStrawberry;

    public Sponge(String name, boolean softStrawberry){
        super(name);
        this.softStrawberry = softStrawberry;
    }

    @Override
    public String baseTexture(){ return "soft";}
}
