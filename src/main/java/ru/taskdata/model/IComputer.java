package ru.taskdata.model;

import ru.taskdata.model.component.HDD;
import ru.taskdata.model.component.Processor;
import ru.taskdata.model.component.RAM;

public interface IComputer {

    void runProcessor ();
    void runHDD ();
    void runRAM ();
    void startAllDevices();
    void stopAllDevices();

}

