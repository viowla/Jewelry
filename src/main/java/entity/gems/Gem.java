package entity.gems;

import entity.Mineral;

public class Gem extends Mineral {

    public Gem(){
        getQuality();
        getColor();
        getTransparency();
        getCarat();
    }
    public double cost() {
        return 6825.0;
    }

}
