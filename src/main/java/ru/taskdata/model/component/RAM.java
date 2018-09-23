package ru.taskdata.model.component;

import ru.taskdata.model.IDevice;
import ru.taskdata.model.utils.LagCreate;
import java.util.Arrays;

public class RAM implements IDevice {

    private ERAMType eramType;
    private Double capacity;
    private EDeviceState eDeviceState;

    public enum ERAMType {SIMM, DIMM, DDR, DDR2, DDR3}

    //Установим устройству статус "Отключено"
    public RAM(){
        this.eDeviceState = EDeviceState.OFFLINE;
    }

    public void setDefaultParameters(){
        this.setEramType(ERAMType.DDR3);
        this.setCapacity(3.0);

    }

    @Override
    public void start() {
        //Проверим, не стартовало ли устройство
        if (this.eDeviceState != EDeviceState.OFFLINE){
            System.out.println("This RAM already started!");

        } else {

            System.out.println("RAM starting......");
            //Проверим установку всех параметров
            checkComplex();
            if (this.getDeviceState() == EDeviceState.NOT_CONFIGURED) {
                System.out.println("Cannot start RAM - device is not configured");
                this.stop();
                //Если системный параметр установлен, то стартуем устройство
            } else {
                LagCreate.lag1000();
                this.eDeviceState = EDeviceState.ONLINE;
                System.out.println("RAM online!");
            }
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

        System.out.println("RAM type checking...");
        LagCreate.lag2000();
        if (this.getEramType() == null) {
            seteDeviceState(EDeviceState.NOT_CONFIGURED);
            System.out.println("RAM type is not configured!");
        } else {
            System.out.println("RAM type checked!");
        }

    }

    //Остановка устройства
    public void stop() {
        //Проверим, что устройство не остановлено
        if (this.eDeviceState == EDeviceState.OFFLINE) {
            System.out.println("RAM is not running! Nothing to stop");

        } else {
            System.out.println("RAM going to stop....");
            LagCreate.lag1000();
            this.eDeviceState = EDeviceState.OFFLINE;
            System.out.println("RAM stopped!");
        }
    }

    public EDeviceState getDeviceState() {
        return this.eDeviceState;
    }

    private void seteDeviceState(EDeviceState eDeviceState) {
        this.eDeviceState = eDeviceState;
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

    private Double getCapacity() {
        return capacity;
    }

    public void setCapacity(Double capacity) {
        this.capacity = capacity;
    }
}
