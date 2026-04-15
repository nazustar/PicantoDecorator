package Decorator;

import Component.Picanto;

public class CarRug extends AccesoryDecorator {
    Picanto picanto;

    public CarRug(Picanto picanto){
        this.picanto = picanto;
    }

    public String getDescription(){
        return picanto.getDescription() + ", Car Rug";
    }

    public double cost(){
        return 92000 + picanto.cost();
    }
}
