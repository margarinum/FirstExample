package ru.taskdata.model.component;

public class HDD {
    private enum hddType{HHD, SSD, Flash};
    private double capacity;

    HDD(){}

    public void start(){
        System.out.println("HDD started!");
    }

    public void stop(){
        System.out.println("HDD stopped!");
    }


    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

}


