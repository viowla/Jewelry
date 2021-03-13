package entity.gems;

import entity.Mineral;

public class Emerald extends Gem {
    Mineral emerald;

    public Emerald(Mineral emerald){
        this.emerald=emerald;
    }

    @Override
    public double cost() {
        return 5400.0;
    }


    public String getEmerald() {
        return emerald.getColor().replace(getColor(), "Green")+emerald.getQuality()+emerald.getTransparency()       ;
    }
}
