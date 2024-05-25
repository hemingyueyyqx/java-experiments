package com.experiment06.entity;

import java.util.ArrayList;
import java.util.List;

public class Ship {
    private int id;
    private String name;
    private double totalWeight;
    private List<Container> containers;

    public Ship(int id, String name, double totalWeight) {
        this.id = id;
        this.name = name;
        this.totalWeight = totalWeight;
        containers = new ArrayList<>();
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

    public double getTotalWeight() {
        return totalWeight;
    }

    public void setTotalWeight(double totalWeight) {
        this.totalWeight = totalWeight;
    }

    public List<Container> getContainers() {
        return containers;
    }

    public void setContainers(List<Container> containers) {
        this.containers = containers;
    }
    public void addContainer(Container container) {
        containers.add(container);
    }
}
