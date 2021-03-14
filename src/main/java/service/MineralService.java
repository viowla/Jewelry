package service;

import entity.Mineral;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MineralService {
    double cost=0.0;

    public double calculateCost(List<Mineral> necklace){
        for (Mineral mineral:necklace){
            cost = cost+(mineral.cost() * mineral.getCarat());
        }
        return cost;
    }

    public void sortMineral(List<Mineral> necklace){
        Collections.sort(necklace, new Comparator<Mineral>() {
            @Override
            public int compare(Mineral o1, Mineral o2) {
                return o1.getDescription().compareTo(o2.getDescription());
            }
        });
    }

}
