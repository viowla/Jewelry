package entity.gems;

import entity.Mineral;

public class Gem extends Mineral {

    public String quality() {
        return "High";
    }

    public String transparency() {
        return "Clear";
    }

    public String color() {
        return "Colorless";
    }

    public double cost() {
        return 6825.0;
    }

    public double weightCarat(){
        return super.weightCarat();
    }
}
