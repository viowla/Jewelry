package entity.semiprecious;

public class Aquamarine extends SemipreciousStone {
    SemipreciousStone aquamarine;

    public Aquamarine(SemipreciousStone aquamarine){
        this.aquamarine=aquamarine;
    }

    @Override
    public double cost() {
        return 60.0;
    }

    @Override
    public String getColor() {
        return aquamarine.getColor().replace(aquamarine.getColor(), "Light blue");
    }

    @Override
    public String getDescription() {
        return getColor()+" "+aquamarine.getQuality()+" "+aquamarine.getTransparency();
    }
}
