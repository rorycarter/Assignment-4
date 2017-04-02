package com.carter.acyclic.Vehicle;

import com.carter.acyclic.Drive.DriverInterface;

/**
 * Created by Rory on 2017-04-02.
 */
public class Vehicle implements DriverInterface {
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    public String driveCar(DriverInterface di, String driving) {
        if(di.driving(driving))
            return "Vehicle is driving at 120km/h";
        else
            return "Vehicle isn't driving";
    }


    public String getCar(String type) {
        return null;
    }

    public boolean driving(String option) {
        if(option.equalsIgnoreCase("yes"))
            return true;
        else
            return false;
    }

}
