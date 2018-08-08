package ru.taskdata.model.component;

import java.util.Arrays;

public class HDD {
    private EHDDType ehddType;
    private double capacity;


    public void start() {
        System.out.println("HDD is starting......");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("HDD started!!!");
    }

    public void stop() {
        System.out.println("HDD going to stop....");
        try {
            Thread.sleep(3000);
        } catch (
                InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("HDD stopped!");
    }


    //Возвращает все значения EHDDType
    public void getAllHddType() {
        System.out.println(Arrays.toString(ehddType.values()));

    }

    public EHDDType getEhddType() {
        return this.ehddType;
    }

    public void setEhddType(EHDDType ehddType) {
        this.ehddType = ehddType;

    }

    public double getCapacity() {
        return this.capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

}


