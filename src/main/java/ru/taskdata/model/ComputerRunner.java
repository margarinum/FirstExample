package ru.taskdata.model;

import ru.taskdata.model.impl.Computer;

public class ComputerRunner {

    IComputer object;

    public Computer add(){

        return new Computer();

    }

    public void run(IComputer computer){

        computer.runProcessor();
        computer.runHDD();
        computer.runRAM();

    }

}
