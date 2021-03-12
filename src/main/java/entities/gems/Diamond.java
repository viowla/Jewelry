package entities.gems;

import entities.Mineral;

public class Diamond extends Gems{

    Mineral diamond;

    public Diamond(Mineral diamond){
        this.diamond=diamond;
    }

    @Override
    public double cost() {
        return 5400.0;
    }

    public String getDiamond() {
        return diamond.color()+diamond.quality()+diamond.transparency();
    }
}
