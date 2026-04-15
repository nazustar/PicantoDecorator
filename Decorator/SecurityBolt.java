package Decorator;

import Component.Picanto;

public class SecurityBolt extends AccesoryDecorator {
    Picanto picanto;

    public SecurityBolt(Picanto picanto){
        this.picanto = picanto;
    }

    public String getDescription(){
        return picanto.getDescription() + ", Security Bolts";
    }

    public double cost(){
        return 156100 + picanto.cost();
    }
}
