import org.opentutorials.iot.*;

import javax.swing.*;

public class OkJavaGoInHome {

    public static void main(String args[]){

        final String id = args[0];
        String brightness = args[1];

        //Elevator call
        Elevator myElevator = new Elevator(id);
        myElevator.callForUp(1);

        //Security off
        Security mySecurity = new Security(id);
        mySecurity.off();

        //Light on
        Lighting hallLamp = new Lighting(id);
        hallLamp.on();

        Lighting floorLamp = new Lighting(id);
        floorLamp.on();

        DimmingLights dimmingLight = new DimmingLights(id);
        dimmingLight.setBright(Double.parseDouble(brightness));


    }
}
