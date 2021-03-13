package entity.semiprecious;

import entity.Mineral;

public class SemipreciousStone extends Mineral {

    public SemipreciousStone(){
        getQuality().replace(getQuality(), "Standard");
        getColor();
        getTransparency().replace(getTransparency(), "Admixture");
        getCarat();
    }

    public double cost() {
        return 75.0;
    }
}
