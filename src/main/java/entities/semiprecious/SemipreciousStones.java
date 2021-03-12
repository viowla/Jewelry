package entities.semiprecious;

import entities.Mineral;

public class SemipreciousStones implements Mineral {
    @Override
    public String quality() {
        return "Standart";
    }

    @Override
    public String transparency() {
        return "Admixture";
    }

    @Override
    public String color() {
        return "Colorless";
    }

    @Override
    public double cost() {
        return 75.0;
    }

    @Override
    public double weightCarat(){
        return 0.2;
    }
}
