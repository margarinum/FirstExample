package ru.taskdata.model.component;
import ru.taskdata.model.IDevice;
import ru.taskdata.model.component.EDeviceState;


public class Processor implements IDevice {

    private String frequency;
    private Integer cores;
    private Integer cahce;
    private EDeviceState eDeviceState;

    public void start() {
        System.out.println("Processor is starting......");
        //TODO Сделать нормальную проверку
        //Проверяем параметры
        if (this.frequency != null){
            System.out.println("Frequency checked...");
        } else {
            System.out.println("Frequency check failed!");
        }

        if (this.cahce != null){
            System.out.println("Cache checked...");
        } else {
            System.out.println("Cache check ");
        }


        try {
            Thread.sleep(1000);
            //Укажем индикатор состояния
            this.eDeviceState = EDeviceState.ONLINE;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Processor started!!!");
    }

    public void stop(){
        System.out.println("Processor stopping......");
        try {
            Thread.sleep(1000);
            //Укажем индикатор состояния
            this.eDeviceState = EDeviceState.OFFLINE;
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Processor stopped!");

    }

    //Getter получает текущий статус работы устройства
    public EDeviceState getDeviceState() {
        return this.eDeviceState;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public void setCores(Integer cores) {
        this.cores = cores;
    }

    public void setCahce(Integer cahce) {
        this.cahce = cahce;
    }

    public String getFrequency() {
        return this.frequency;
    }

    public Integer getCores() {
        return this.cores;
    }

    public Integer getCahce() {
        return this.cahce;
    }
}
