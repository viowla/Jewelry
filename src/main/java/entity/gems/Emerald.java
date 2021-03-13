package entity.gems;

import entity.Mineral;

public class Emerald extends Gem {
    Gem emerald;

    public Emerald(Gem emerald){
        this.emerald=emerald;
    }

    @Override
    public double cost() {
        return 5400.0;
    }


    public String getDescription() {
        return emerald.getColor().replace(getColor(), "Green")+emerald.getQuality()+emerald.getTransparency()       ;
    }
}
