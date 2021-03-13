package entity.semiprecious;

import entity.Mineral;

public class Aquamarine extends SemipreciousStone {
    SemipreciousStone aquamarine;

    public Aquamarine(SemipreciousStone aquamarine){
        this.aquamarine=aquamarine;
    }

    @Override
    public double cost() {
        return 60.0;
    }

    public String getAquamarine() {
        return aquamarine.getColor().replace(getColor(), "Light blue")+aquamarine.getQuality()+aquamarine.getTransparency();
    }
}
