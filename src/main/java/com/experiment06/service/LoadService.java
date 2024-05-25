package com.experiment06.service;

import com.experiment06.entity.Container;
import com.experiment06.entity.Ship;
import com.experiment06.exception.OverWeightException;

import java.util.List;

public class LoadService {
    public static Ship loadContainers(Ship ship, List<Container> containers) throws OverWeightException {
        double totalWeight = 0;
        for(Container container : containers) {
            totalWeight += container.getWeight();
        }
        if(totalWeight > ship.getTotalWeight()) {
            throw new OverWeightException(ship.getId(), ship.getName(), totalWeight - ship.getTotalWeight());
        }
        for (Container container : containers) {
            ship.addContainer(container);
        }
        return ship;

    }
}
