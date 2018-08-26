package ru.taskdata.model.impl;

import ru.taskdata.model.component.HDD;
import ru.taskdata.model.component.Processor;
import ru.taskdata.model.component.RAM;
import ru.taskdata.model.IComputer;

public class Computer implements IComputer {

    Processor processor;
    HDD hdd;
    RAM ram;

    /*Первый конструктор не принимает параметров и создает объекты устройств с методом setDefaultParameters
    Он устанавливает стандартные значения устройств
     */

    public Computer(){
        processor = new Processor();
        processor.setDefaultParameters();

        ram = new RAM();
        ram.setDefaultParameters();

        hdd = new HDD();
        hdd.setDefaultParameters();
    }

    /*Второй конструктор принимает на вход объекты устройств
     */

    public Computer(Processor processor, RAM ram, HDD hdd){
        processor = new Processor();
        ram = new RAM();
        hdd = new HDD();

    }

    public void startAllDevices(){
        System.out.println("Computer starting...");
        PrintSplit.printDots();
        runProcessor(processor);
        rumHDD(hdd);
        rumRAM(ram);
    }

    public void runProcessor(Processor processor) {
        processor.start();
        PrintSplit.printDots();

    }

    public void rumHDD(HDD hdd) {
        hdd.start();
        PrintSplit.printDots();
    }

    public void rumRAM(RAM ram) {
        ram.start();
        PrintSplit.printDots();
    }

    public void stopProcessor(Processor processor){
        processor.stop();
    }

    public void stopHDD(HDD hdd){
        hdd.stop();
    }

    public void stopRAM(RAM ram){
        ram.stop();
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public HDD getHdd() {
        return hdd;
    }

    public void setHdd(HDD hdd) {
        this.hdd = hdd;
    }

    public RAM getRam() {
        return ram;
    }

    public void setRam(RAM ram) {
        this.ram = ram;
    }
}
