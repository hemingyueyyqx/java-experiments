package com.experiment06;

import com.experiment06.entity.Container;
import com.experiment06.entity.Ship;
import com.experiment06.exception.OverWeightException;
import com.experiment06.service.LoadService;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        loadContainersTest1();
        //loadContainersTest2();
    }

    public static void loadContainersTest1() {
        Ship ship1 = new Ship(1, "ship1", 100);
        List<Container> containers = new ArrayList<>();
        containers.add(new Container(1, 30));
        containers.add(new Container(2,40));
        containers.add(new Container(3, 50));
        try {
            Ship ship = LoadService.loadContainers(ship1, containers);
            System.out.println(ship.getName());
        }catch (OverWeightException e) {
            System.out.println(e.getMessage());
        }finally {
            System.out.println("启航");
        }
    }
    public static void loadContainersTest2() {
        Ship ship2 = new Ship(2, "ship2", 150);
        List<Container> containers = new ArrayList<>();
        containers.add(new Container(1, 30));
        containers.add(new Container(2,40));
        containers.add(new Container(3, 50));
        try {
            Ship ship = LoadService.loadContainers(ship2, containers);
            System.out.println(ship.getName());
        }catch (OverWeightException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("启航");
        }
    }
}
