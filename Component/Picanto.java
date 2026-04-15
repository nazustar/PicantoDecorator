package Component;

public abstract class Picanto{
    String description = "Unknown Picanto Car";

    public String getDescription(){
        return description;
    }

    public abstract double cost();
}