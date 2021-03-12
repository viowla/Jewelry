package entities.gems;

import entities.Mineral;

public class Emerald extends Gems{
    Mineral emerald;

    public Emerald(Mineral emerald){
        this.emerald=emerald;
    }

    @Override
    public double cost() {
        return 5400.0;
    }

    @Override
    public String color() {
        return "Green";
    }

    public String getEmerald() {
        return emerald.color()+emerald.quality()+emerald.transparency();
    }
}
