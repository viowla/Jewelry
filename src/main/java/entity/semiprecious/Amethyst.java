package entity.semiprecious;

import entity.Mineral;

public class Amethyst extends SemipreciousStone {
    SemipreciousStone amethyst;

    public Amethyst(SemipreciousStone amethyst){
        this.amethyst=amethyst;
    }

    @Override
    public double cost() {
        return 42.0;
    }

    public String getAmethyst() {
        return amethyst.getColor().replace(getColor(), "Purple")+amethyst.getQuality()+amethyst.getTransparency();
    }
}
