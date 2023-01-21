package com.driver;

public class Boat implements WaterVehicle{

    private String name;
    private int capacity;

   public Boat(String name, int capacity){
       this.name =  name;
       this.capacity = capacity;
   }

    public void setName(String name) {
        this.name = name;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }


    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String getVehicleName() {
        return getName();
    }

    @Override
    public int getVehicleCapacity() {
        return getCapacity();
    }
}
