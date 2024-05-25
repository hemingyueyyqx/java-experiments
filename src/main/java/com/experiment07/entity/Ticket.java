package com.experiment07.entity;

public class Ticket {
    private Integer id;
    private String startStationName;
    private String endStationName;

    public Ticket(Integer id, String startStationName, String endStationName) {
        this.id = id;
        this.startStationName = startStationName;
        this.endStationName = endStationName;
    }

}
