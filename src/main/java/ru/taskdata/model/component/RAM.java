package ru.taskdata.model.component;
import ru.taskdata.model.component.ERAMType;

import java.util.Arrays;

public class RAM {

    private ERAMType eramType;
    private Double capacity;

    public void start(){
        System.out.println("RAM starting......");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("RAM online!");

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
