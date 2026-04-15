package Decorator;

import Component.Picanto;

public class PowerButton extends AccesoryDecorator {
    Picanto picanto;

    public PowerButton(Picanto picanto){
        this.picanto = picanto;
    }

    public String getDescription(){
        return picanto.getDescription() + ", Load Mesh";
    }

    public double cost(){
        return 1500000 + picanto.cost();
    }
}
