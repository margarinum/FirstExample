package ru.taskdata.model;
import ru.taskdata.model.component.EDeviceState;

public interface IDevice {

    void start();
    void stop();
    //Ввел метод для упрощения создания тестовых примеров. Устанавливает свойства по умолчанию
    void setDefaultParameters();

    EDeviceState getDeviceState();

    enum EDeviceState { ONLINE, OFFLINE, NOT_CONFIGURED}


}
