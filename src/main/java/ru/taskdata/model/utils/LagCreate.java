package ru.taskdata.model.utils;

//Класс устанавливает SLEEP
public class LagCreate {
    public static void lag200(){
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void lag500(){
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void lag1000(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void lag2000(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    LagCreate(int count) throws InterruptedException {
        Thread.sleep(count);
    }

}


