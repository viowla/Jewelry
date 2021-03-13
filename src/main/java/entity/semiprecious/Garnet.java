package entity.semiprecious;

import entity.Mineral;

public class Garnet extends SemipreciousStone {
    Mineral garnet;

    public Garnet(Mineral garnet){
        this.garnet=garnet;
    }

    @Override
    public double cost() {
        return 60.0;
    }

    public String getGarnet() {
        return garnet.getColor().replace(getColor(), "Dark red")+garnet.getQuality()+garnet.getTransparency();
    }
}
