package ru.taskdata.model;

import ru.taskdata.model.impl.Computer;

import java.util.HashMap;
import java.util.Map;

public class ComputerRunner  {


    Map<IComputer, String> hashmap = new HashMap<IComputer, String>();

    public Map<IComputer, String> add(IComputer computer_obj){

        hashmap.put(computer_obj, getAddr(computer_obj));
        return hashmap;
    }

    private String getAddr(IComputer obj){
       return obj.toString();
    }

    public void run(IComputer computer){

        computer.runProcessor();
        computer.runHDD();
        computer.runRAM();

    }

}
