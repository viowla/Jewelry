package entities.gems;

import entities.Mineral;

public class Gems implements Mineral {

    @Override
    public String quality() {
        return "High";
    }

    @Override
    public String transparency() {
        return "Clear";
    }

    @Override
    public String color() {
        return "Colorless";
    }

    @Override
    public double cost() {
        return 6825.0;
    }

    @Override
    public double weightCarat(){
        return 0.2;
    }
}
