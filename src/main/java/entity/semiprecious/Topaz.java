package entity.semiprecious;

public class Topaz extends SemipreciousStone {
    SemipreciousStone topaz;

    public Topaz(SemipreciousStone topaz){
        this.topaz=topaz;
    }

    @Override
    public double cost() {
        return 70.0;
    }

    @Override
    public String getColor() {
        return topaz.getColor().replace(topaz.getColor(), "Yellow");
    }

    @Override
    public String getDescription() {
        return getColor()+" "+topaz.getQuality()+" "+topaz.getTransparency();
    }
}
