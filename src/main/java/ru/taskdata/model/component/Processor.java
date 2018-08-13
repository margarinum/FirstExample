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
        try {
            Thread.sleep(1000);
            //Укажем индикатор состояния = 1
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
            //Укажем индикатор состояния = 0
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
        return frequency;
    }

    public Integer getCores() {
        return this.cores;
    }

    public Integer getCahce() {
        return this.cahce;
    }
}
