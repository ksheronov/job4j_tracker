package ru.job4j.oop;

public class Builder extends Engineer {
    private String jobClass;

    @Override
    public String getName() {
        return super.getName();
    }

    public Job job(Orderer orderer) {
      return job(orderer);
    }
}
