package entity.gems;

import entity.Mineral;

public class Sapphire extends Gem {

    Gem sapphire;

    public Sapphire(Gem sapphire){
        this.sapphire=sapphire;
    }

    @Override
    public double cost() {
        return 10000.0;
    }


    public String getSapphire() {
        return sapphire.getColor().replace(getColor(), "Blue")+sapphire.getQuality()+sapphire.getTransparency();
    }
}
