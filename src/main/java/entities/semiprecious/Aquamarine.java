package entities.semiprecious;

import entities.Mineral;

public class Aquamarine extends SemipreciousStones{
    Mineral aquamarine;

    public Aquamarine(Mineral aquamarine){
        this.aquamarine=aquamarine;
    }

    @Override
    public double cost() {
        return 60.0;
    }

    @Override
    public String color() {
        return "Light blue";
    }

    @Override
    public String transparency() {
        return "Clear";
    }

    public String getAquamarine() {
        return aquamarine.color()+aquamarine.quality()+aquamarine.transparency();
    }
}
