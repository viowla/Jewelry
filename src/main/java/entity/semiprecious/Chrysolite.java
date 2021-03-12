package entity.semiprecious;

import entity.Mineral;

public class Chrysolite extends SemipreciousStone {
    Mineral chrysolite;

    public Chrysolite(Mineral chrysolite){
        this.chrysolite=chrysolite;
    }

    @Override
    public double cost() {
        return 170.0;
    }

    @Override
    public String color() {
        return "Olive";
    }

    @Override
    public String transparency() {
        return "Clear";
    }

    public String getChrysolite() {
        return chrysolite.color()+chrysolite.quality()+chrysolite.transparency();
    }
}
