package com.carter.acyclic.Driver;

import com.carter.acyclic.Drive.DriverInterface;
import com.carter.acyclic.Vehicle.Vehicle;
/**
 * Created by Rory on 2017-04-02.
 */
public class Human implements DriverInterface {


    public String driveCar(DriverInterface di, String driving) {
        return null;
    }


    public String getCar(String type) {
        Vehicle vh = new Vehicle();
        vh.setType(type);
        return vh.getType();
    }


    public boolean driving(String option) {
        if(option.equalsIgnoreCase("yes"))
            return true;
        else
            return false;
    }

}
