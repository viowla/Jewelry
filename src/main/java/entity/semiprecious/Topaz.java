package entity.semiprecious;

import entity.Mineral;

public class Topaz extends SemipreciousStone {
    Mineral topaz;

    public Topaz(Mineral topaz){
        this.topaz=topaz;
    }

    @Override
    public double cost() {
        return 60.0;
    }

    public String getTopaz() {
        return topaz.getColor().replace(getColor(), "Yellow")+topaz.getQuality()+topaz.getTransparency();
    }
}
