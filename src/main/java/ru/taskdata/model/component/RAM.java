package ru.taskdata.model.component;
import ru.taskdata.model.IDevice;


import java.util.Arrays;

public class RAM implements IDevice {

    private ERAMType eramType;
    private Double capacity;
    private EDeviceState eDeviceState;

    @Override
    public void start(){
        System.out.println("RAM starting......");
        try {
            Thread.sleep(1000);
            //Укажем индикатор состояния = 1
            this.eDeviceState = EDeviceState.ONLINE;
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("RAM online!");

    }

    @Override
    public void stop(){
        System.out.println("RAM stopping......");
        try {
            Thread.sleep(1000);
            //Укажем индикатор состояния OFFLINE
            this.eDeviceState = EDeviceState.OFFLINE;
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("RAM stopped!");

    }

    @Override
    public EDeviceState getDeviceState() {
        return this.eDeviceState;
    }


    public void getAllRAMType() {
        System.out.println(Arrays.toString(eramType.values()));
    }

    public ERAMType getEramType() {
        return eramType;
    }

    public void setEramType(ERAMType eramType) {
        this.eramType = eramType;
    }

    public Double getCapacity() {
        return capacity;
    }

    public void setCapacity(Double capacity) {
        this.capacity = capacity;
    }
}
