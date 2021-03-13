package entity.gems;

import entity.Mineral;

public class Diamond extends Gem {

    Mineral diamond;

    public Diamond(Mineral diamond){
        this.diamond=diamond;
    }

    @Override
    public double cost() {
        return 5400.0;
    }

    public String getDiamond() {
        return diamond.getColor()+diamond.getQuality()+diamond.getQuality();
    }
}
