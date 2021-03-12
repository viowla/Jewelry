package entities.gems;

public class Emerald extends Gems{
    Gems emerald;

    public Emerald(Gems emerald){
        this.emerald=emerald;
    }

    @Override
    public double cost() {
        return 5400.0;
    }

    public String getEmerald() {
        return emerald.color()+emerald.quality()+emerald.transparency();
    }
}
