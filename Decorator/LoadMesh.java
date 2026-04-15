package Decorator;

import Component.Picanto;

public class LoadMesh extends AccesoryDecorator {
    Picanto picanto;

    public LoadMesh(Picanto picanto){
        this.picanto = picanto;
    }

    public String getDescription(){
        return picanto.getDescription() + ", Load Mesh";
    }

    public double cost(){
        return 110000 + picanto.cost();
    }
}
