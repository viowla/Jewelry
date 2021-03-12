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

    @Override
    public String color() {
        return "White";
    }

    public String getOpal() {
        return opal.color()+opal.quality()+opal.transparency();
    }
}
