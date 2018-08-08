package ru.taskdata.model.component;

public class Processor {

    private String frequency;
    private Integer cores;
    private Integer cahce;

    public void start() {
        System.out.println("Processor is starting......");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Processor started!!!");
    }

    public void stop() {
        System.out.println("Processor stopped!");

    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public void setCores(Integer cores) {
        this.cores = cores;
    }

    public void setCahce(Integer cahce) {
        this.cahce = cahce;
    }

    public String getFrequency() {
        return frequency;
    }

    public Integer getCores() {
        return this.cores;
    }

    public Integer getCahce() {
        return this.cahce;
    }
}
