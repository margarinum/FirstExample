package ru.taskdata.model.component;
import ru.taskdata.model.IDevice;
import ru.taskdata.model.utils.LagCreate;


public class Processor implements IDevice {

    private Integer frequency;
    private Integer cores;
    private Integer cahce;
    private EDeviceState eDeviceState;

    //Установим устройству статус "Отключено"
    public Processor() {
        this.eDeviceState = EDeviceState.OFFLINE;
    }

    public void setDefaultParameters(){
        this.setCores(2);
        this.setCahce(2);
        this.setFrequency(3);

    }

    public void start() {
        //Проверим, не стартовало ли устройство
        if (this.eDeviceState != EDeviceState.OFFLINE) {
            System.out.println("This processor already started!");

        } else {

            System.out.println("Processor starting......");
            //Проверим установку всех параметров
            checkComplex();
            if (this.getDeviceState() == EDeviceState.NOT_CONFIGURED) {
                System.out.println("Cannot start processor - device is not configured");
                this.stop();
                //Если системный параметр установлен, то стартуем устройство
            } else {
                LagCreate.lag1000();
                this.eDeviceState = EDeviceState.ONLINE;
                System.out.println("Processor online!");
            }
        }
    }

    public void stop() {
        //Проверим, что устройство не остановлено
        if (this.eDeviceState == EDeviceState.OFFLINE) {
            System.out.println("Processor is not running! Nothing to stop");

        } else {
            System.out.println("Processor going to stop....");
            LagCreate.lag1000();
            this.eDeviceState = EDeviceState.OFFLINE;
            System.out.println("Processor stopped!");
        }
    }

    //Метод проверки конфигурации устройства, используем getter's

    private void checkComplex() {
        //Если какой-то параметр не установлен, устанавливаем статус устройства NOT_CONFIGURED
        System.out.println("Frequency checking...");
        LagCreate.lag1000();

        if (this.getFrequency() == null) {
            setDeviceState(EDeviceState.NOT_CONFIGURED);
            System.out.println("Frequency is not configured!");
        } else {
            System.out.println("Frequency checked");
        }

        System.out.println("Cores type checking...");
        LagCreate.lag2000();
        if (this.getCores() == null) {
            setDeviceState(EDeviceState.NOT_CONFIGURED);
            System.out.println("Cores is not configured!");
        } else {
            System.out.println("Cores checked!");
        }

        System.out.println("Cache checking...");
        LagCreate.lag2000();
        if (this.getCahce() == null) {
            setDeviceState(EDeviceState.NOT_CONFIGURED);
            System.out.println("Cache is not configured!");
        } else {
            System.out.println("Cache type checked!");
        }

    }

    private Integer getFrequency() {
        return this.frequency;
    }

    public void setFrequency(Integer frequency) {
        this.frequency = frequency;
    }

    private Integer getCores() {
        return cores;
    }

    public void setCores(Integer cores) {
        this.cores = cores;
    }

    private Integer getCahce() {
        return cahce;
    }

    public void setCahce(Integer cahce) {
        this.cahce = cahce;
    }

    public EDeviceState getDeviceState() {
        return eDeviceState;
    }

    private void setDeviceState(EDeviceState eDeviceState) {
        this.eDeviceState = eDeviceState;
    }

}