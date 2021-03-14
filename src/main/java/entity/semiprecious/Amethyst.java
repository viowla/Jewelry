package entity.semiprecious;

public class Amethyst extends SemipreciousStone {
    SemipreciousStone amethyst;

    public Amethyst(SemipreciousStone amethyst){
        this.amethyst=amethyst;
    }

    @Override
    public double cost() {
        return 42.0;
    }

    @Override
    public String getColor() {
        return amethyst.getColor().replace(amethyst.getColor(), "Purple");
    }

    @Override
    public String getDescription() {
        return getColor()+" "+amethyst.getQuality()+" "+amethyst.getTransparency();
    }
}
