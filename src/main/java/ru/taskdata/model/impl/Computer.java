package ru.taskdata.model.impl;

import ru.taskdata.model.component.HDD;
import ru.taskdata.model.component.Processor;
import ru.taskdata.model.component.RAM;
import ru.taskdata.model.IComputer;

public class Computer implements IComputer {

    public Computer(Processor processor, HDD hdd, RAM ram){

    }

    public void runProcessor(Processor processor) {
        processor.setDefaultParameters();
        processor.start();

    }

    public void rumHDD(HDD hdd) {
        hdd.setDefaultParameters();
        hdd.start();
    }

    public void rumRAM(RAM ram) {
        ram.setDefaultParameters();
        ram.start();
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

}
