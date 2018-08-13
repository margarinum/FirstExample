package ru.taskdata.model.component;

import ru.taskdata.model.IDevice;

import java.util.Arrays;

public class HDD implements IDevice {
    private EHDDType ehddType;
    private double capacity;
    private EDeviceState eDeviceState;



    public void start() {
        System.out.println("HDD is starting......");
        try {
            Thread.sleep(1000);
            //Укажем индикатор состояния
            this.eDeviceState = EDeviceState.ONLINE;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("HDD started!!!");
    }

    public void stop() {
        System.out.println("HDD going to stop....");
        try {
            Thread.sleep(3000);
            //Укажем индикатор состояния
            this.eDeviceState = EDeviceState.OFFLINE;

        } catch (
                InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("HDD stopped!");
    }

    @Override
    public EDeviceState getDeviceState() {
        return this.eDeviceState;
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


