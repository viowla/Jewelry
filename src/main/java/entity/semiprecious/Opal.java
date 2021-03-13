package entity.semiprecious;

import entity.Mineral;

public class Opal extends SemipreciousStone {
    Mineral opal;

    public Opal(Mineral opal){
        this.opal=opal;
    }

    @Override
    public double cost() {
        return 50.0;
    }


    public String getOpal() {
        return opal.getColor().replace(getColor(), "White")+opal.getQuality()+opal.getTransparency().replace(getTransparency(), "Admixture");
    }
}
