package org.example;

public abstract class Cake, implements Sponge {

    private String name;

    //private boolean healthier;

    public Cake(String name){
        this.name = name;
    }

    public String shapedlike(){
      return "I am shaped like a " + this.name + "";
    }

    public String baseTexture(){
        return "woow, this is delicious";
    }
}
