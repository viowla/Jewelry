package entity.semiprecious;

public class Garnet extends SemipreciousStone {
    SemipreciousStone garnet;

    public Garnet(SemipreciousStone garnet){
        this.garnet=garnet;
    }

    @Override
    public double cost() {
        return 60.0;
    }

    @Override
    public String getColor() {
        return garnet.getColor().replace(garnet.getColor(), "Dark red");
    }

    @Override
    public String getDescription() {
        return getColor()+" "+garnet.getQuality()+" "+garnet.getTransparency();
    }
}
