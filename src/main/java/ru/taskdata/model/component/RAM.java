package ru.taskdata.model.component;
import ru.taskdata.model.component.ERAMType;

import java.util.Arrays;

public class RAM {

    private ERAMType eramType;
    private Double capacity;
    private int deviceState = 0;


    public void start(){
        System.out.println("RAM starting......");
        try {
            Thread.sleep(1000);
            //Укажем индикатор состояния = 1
            deviceState = 1;
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("RAM online!");

    }

    public void stop(){
        System.out.println("RAM stopping......");
        try {
            Thread.sleep(1000);
            //Укажем индикатор состояния = 0
            deviceState = 0;
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("RAM stopped!");

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
