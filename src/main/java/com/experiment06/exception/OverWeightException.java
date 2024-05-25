package com.experiment06.exception;

public class OverWeightException extends Exception{
    private int id;
    private String name;
    private double overweight;

    public OverWeightException(int id, String name, double overweight) {
        this.id = id;
        this.name = name;
        this.overweight = overweight;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getOverweight() {
        return overweight;
    }

    public void setOverweight(double overweight) {
        this.overweight = overweight;
    }

    @Override
    public String getMessage() {
        return "船" + id + "(" + name + ")超重了" + overweight;
    }
}
