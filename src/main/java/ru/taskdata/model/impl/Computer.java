package ru.taskdata.model.impl;

import ru.taskdata.model.component.HDD;
import ru.taskdata.model.component.Processor;
import ru.taskdata.model.component.RAM;
import ru.taskdata.model.IComputer;
import ru.taskdata.model.utils.LagCreate;
import ru.taskdata.model.utils.PrintSplit;

public class Computer implements IComputer {

    Processor processor;
    HDD hdd;
    RAM ram;

    /*Первый конструктор не принимает параметров и создает объекты устройств с методом setDefaultParameters
    Он устанавливает стандартные значения устройств
     */

    public Computer(Processor processor, HDD hdd, RAM ram) {
        this.processor = processor;
        this.hdd = hdd;
        this.ram = ram;
    }

    public Computer() {
        this.processor.setDefaultParameters();
        this.hdd.setDefaultParameters();
        this.ram.setDefaultParameters();
    }

    public void startAllDevices(){
        System.out.println("Computer starting...");
        LagCreate.lag2000();
        PrintSplit.printDots();
        runProcessor();
        runHDD();
        runRAM();
        PrintSplit.printDots();
        System.out.println("Computer started!");
    }

    public void stopAllDevices(){
        System.out.println("Computer stopping...");
        LagCreate.lag1000();
        PrintSplit.printDots();
        stopProcessor();
        stopHDD();
        stopRAM();
        PrintSplit.printDots();
        System.out.println("Computer stopped!");
    }

    public void runProcessor() {
        processor.start();
        PrintSplit.printDots();

    }

    public void runHDD() {
        hdd.start();
        PrintSplit.printDots();
    }

    public void runRAM() {
        ram.start();
        PrintSplit.printDots();
    }

    public void stopProcessor(){
        processor.stop();
    }

    public void stopHDD(){
        hdd.stop();
    }

    public void stopRAM(){
        ram.stop();
    }




}
