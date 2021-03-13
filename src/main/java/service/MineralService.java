package service;

import entity.Mineral;

import java.util.ArrayList;
import java.util.List;

public class MineralService {
    double cost=0.0;

    public double calculateCost(List<Mineral> necklace){
        for (Mineral mineral:necklace){
            cost = cost+mineral.cost();
        }
        return cost;
    }


}
