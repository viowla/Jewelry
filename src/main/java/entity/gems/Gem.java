package entity.gems;

import entity.Mineral;

public class Gem extends Mineral {

    public Gem(){
        super.getQuality();
        super.getCarat();
        super.getColor();
        super.getTransparency();
    }

    @Override
    public String getQuality() {
        return super.getQuality();
    }

    @Override
    public String getTransparency() {
        return super.getTransparency();
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public double getCarat() {
        return super.getCarat();
    }

    public double cost() {
        return 6825.0;
    }

}
