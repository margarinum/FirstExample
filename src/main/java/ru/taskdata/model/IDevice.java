package ru.taskdata.model;
import ru.taskdata.model.component.EDeviceState;

public interface IDevice {

    void start();
    void stop();
    EDeviceState getDeviceState();


}
