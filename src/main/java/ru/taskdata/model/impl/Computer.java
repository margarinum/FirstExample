package ru.taskdata.model.impl;
import ru.taskdata.model.component.HDD;
import ru.taskdata.model.component.Processor;
import ru.taskdata.model.component.RAM;
import ru.taskdata.model.IComputer;

public class Computer implements IComputer {

    private Processor processor ;
    private HDD hdd;
    private RAM ram;


    @Override
    public void runProcessor() {
        processor.start();
    }

    @Override
    public void rumHDD() {
        hdd.start();
    }

    @Override
    public void rumRAM() {
        hdd.start();
        System.out.println("RAM running");
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
