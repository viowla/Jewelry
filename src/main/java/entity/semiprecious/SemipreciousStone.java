package entity.semiprecious;

import entity.Mineral;

public class SemipreciousStone extends Mineral {

    public String quality() {
        return "Standart";
    }

    public String transparency() {
        return "Admixture";
    }

    public String color() {
        return "Colorless";
    }

    public double cost() {
        return 75.0;
    }

    public double weightCarat(){
        return super.weightCarat();
    }
}
