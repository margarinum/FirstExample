package ru.src.items;
import ru.src.items.Processor;
import ru.src.items.HDD;
import ru.src.items.RAM;

public class Computer implements IComputer {

    Processor processor ;
    HDD hdd;
    RAM ram;



    @Override
    public void runProcessor() {
        processor.start();
        System.out.println("Processor running");
    }

    @Override
    public void rumHDD() {
        hdd.start();
        System.out.println("HDD running");
    }

    @Override
    public void rumRAM() {
        hdd.start();
        System.out.println("RAM running");
    }

    public void setProcessor(Processor processor) {
        this.processor = new Processor();
    }

    public void setHDD(HDD hdd) {
        this.hdd = HDD();
    }

    public void setRAM(RAM ram) {
        this.ram = RAM();
    }

    public Processor getProcessor() {
        return processor;
    }

    public HDD getHDD() {
        return hdd;
    }

    public RAM getRAM() {
        return ram;
    }
}
