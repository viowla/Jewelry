package entity.semiprecious;

import entity.Mineral;

public class Amethyst extends SemipreciousStone {
    Mineral amethyst;

    public Amethyst(Mineral amethyst){
        this.amethyst=amethyst;
    }

    @Override
    public double cost() {
        return 42.0;
    }

    @Override
    public String color() {
        return "Purple";
    }

    @Override
    public String transparency() {
        return "Clear";
    }

    public String getAmethyst() {
        return amethyst.color()+amethyst.quality()+amethyst.transparency();
    }
}
