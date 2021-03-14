package entity.gems;

import entity.Mineral;

public class Gem extends Mineral {

    public Gem(){
        super.getQuality();
        super.getCarat();
        super.getColor();
        super.getTransparency();
    }

    public double cost() {
        return 6825.0;
    }

}
