package entity.gems;

import entity.Mineral;

public class Diamond extends Gem {

    Gem diamond;

    public Diamond(Gem diamond){
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
