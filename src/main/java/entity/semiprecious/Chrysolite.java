package entity.semiprecious;

import entity.Mineral;

public class Chrysolite extends SemipreciousStone {
    Mineral chrysolite;

    public Chrysolite(Mineral chrysolite){
        this.chrysolite=chrysolite;
    }

    @Override
    public double cost() {
        return 170.0;
    }

    public String getChrysolite() {
        return chrysolite.getColor().replace(getColor(), "Olive")+chrysolite.getQuality()+chrysolite.getTransparency();
    }
}
