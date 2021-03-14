package entity.semiprecious;

import entity.Mineral;

public class SemipreciousStone extends Mineral {

    public SemipreciousStone(){
        super.getQuality();
        super.getCarat();
        super.getColor();
        super.getTransparency();
    }

    @Override
    public String getQuality() {
        return super.getQuality().replace(super.getQuality(), "Standard");
    }


    public double cost() {
        return 75.0;
    }
}
