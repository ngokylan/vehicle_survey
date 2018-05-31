/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data_objects;

import java.util.ArrayList;

/**
 *
 * @author ducnguyen
 */
public class Day {
    protected ArrayList<Vehicle> vehicles = new ArrayList<>();
    
    /**
     * 
     * @param vehicle 
     */
    public void addVehicleToDay(Vehicle vehicle)
    {
        this.vehicles.add(vehicle);
    }

    /**
     * @return the vehicles
     */
    public ArrayList<Vehicle> getVehicles() {
        return this.vehicles;
    }

    /**
     * @param vehicles the vehicles to set
     */
    public void setVehicles(ArrayList<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }
    
    
}
