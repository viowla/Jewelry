package entity.gems;

public class Emerald extends Gem {
    Gem emerald;

    public Emerald(Gem emerald){
        this.emerald=emerald;
    }

    @Override
    public double cost() {
        return 3900.0;
    }

    @Override
    public String getColor() {
        return emerald.getColor().replace(emerald.getColor(), "Green");
    }

    @Override
    public String getDescription() {
        return getColor()+" "+emerald.getQuality()+" "+emerald.getTransparency();
    }
}
