import Component.*;
import Decorator.CarRug;
import Decorator.LoadMesh;
import Decorator.PowerButton;
import Decorator.SecurityBolt;

public class Main {
    public static void main(String[] args) {
        //Vibrant MT.
        Picanto picanto1 = new VibrantMT();

        picanto1 = new LoadMesh(picanto1);
        picanto1 = new CarRug(picanto1);
        picanto1 = new SecurityBolt(picanto1);

        System.out.println(picanto1.getDescription()+ " $" + picanto1.cost());

        //Zenith MT.
        Picanto picanto2 = new ZenithMT();

        picanto2 = new PowerButton(picanto2);
        picanto2 = new CarRug(picanto2);

        System.out.println(picanto2.getDescription()+ " $" + picanto2.cost());

        //Zenith AT.
        Picanto picanto3 = new ZenithAT();

        picanto3 = new CarRug(picanto3);
        picanto3 = new PowerButton(picanto3);
        picanto3 = new SecurityBolt(picanto3);

        System.out.println(picanto3.getDescription()+ " $" + picanto3.cost());

        //GT Line.
        Picanto picanto4 = new GTLine();

        picanto4 = new SecurityBolt(picanto4);
        picanto4 = new LoadMesh(picanto4);
        picanto4 = new CarRug(picanto4);
        picanto4 = new PowerButton(picanto4);

        System.out.println(picanto4.getDescription()+ " $" + picanto4.cost());

    }
}
