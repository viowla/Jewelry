package entity.gems;

import entity.Mineral;

public class Diamond extends Gem {

    Gem diamond;

    public Diamond(Gem diamond){
        this.diamond=diamond;
    }

    @Override
    public String getQuality() {
        return super.getQuality();
    }

    @Override
    public String getTransparency() {
        return super.getTransparency();
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public double getCarat() {
        return super.getCarat();
    }

    @Override
    public double cost() {
        return 5400.0;
    }

    public String getDescription() {
        return diamond.getColor()+" "+diamond.getQuality()+" "+diamond.getTransparency();
    }
}
