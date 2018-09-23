package ru.taskdata.model.component;

import ru.taskdata.model.IDevice;
import ru.taskdata.model.utils.LagCreate;

import java.util.Arrays;

public class HDD implements IDevice {
    private EHDDType ehddType;
    private Double capacity;
    private EDeviceState eDeviceState;

    public enum EHDDType {SSD, HDD, Flash}

    //Установим устройству статус "Отключено"
    public HDD() {
        this.eDeviceState = EDeviceState.OFFLINE;
    }


    public void setDefaultParameters() {
        this.setEhddType(EHDDType.SSD);
        this.setCapacity(2.0);

    }

    public void start() {
        //Проверим, не стартовало ли устройство
        if (this.eDeviceState != EDeviceState.OFFLINE) {
            System.out.println("This HDD already started!");

        } else {

            System.out.println("HDD starting......");
            //Проверим установку всех параметров
            checkComplex();
            if (this.getDeviceState() == EDeviceState.NOT_CONFIGURED) {
                System.out.println("Cannot start HDD - device is not configured");
                this.stop();
                //Если системный параметр установлен, то стартуем устройство
            } else {
                LagCreate.lag1000();
                this.eDeviceState = EDeviceState.ONLINE;
                System.out.println("HDD online!");
            }
        }
    }

    public void stop() {
        //Проверим, что устройство не остановлено
        if (this.eDeviceState == EDeviceState.OFFLINE) {
            System.out.println("HDD is not running! Nothing to stop");

        } else {
            System.out.println("HDD going to stop....");
            LagCreate.lag1000();
            this.eDeviceState = EDeviceState.OFFLINE;
            System.out.println("HDD stopped!");
        }
    }

    //Метод проверки конфигурации устройства
    private void checkComplex() {
        System.out.println("Capacity checking...");
        LagCreate.lag1000();
        if (this.getCapacity() == null) {
            seteDeviceState(EDeviceState.NOT_CONFIGURED);
            System.out.println("Capacity is not configured!");
        } else {
            System.out.println("Сapacity checked");
        }

        System.out.println("HDD type checking...");
        LagCreate.lag2000();
        if (this.getEhddType() == null) {
            seteDeviceState(EDeviceState.NOT_CONFIGURED);
            System.out.println("HDD type is not configured!");
        } else {
            System.out.println("HDD type checked!");
        }

    }

    public EDeviceState getDeviceState() {
        return this.eDeviceState;
    }

    public void seteDeviceState(EDeviceState eDeviceState) {
        this.eDeviceState = eDeviceState;
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

    public Double getCapacity() {
        return this.capacity;
    }

    public void setCapacity(Double capacity) {
        this.capacity = capacity;
    }

}


