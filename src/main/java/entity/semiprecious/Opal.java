package entity.semiprecious;

public class Opal extends SemipreciousStone {
    SemipreciousStone opal;

    public Opal(SemipreciousStone opal){
        this.opal=opal;
    }

    @Override
    public double cost() {
        return 50.0;
    }

    @Override
    public String getColor() {
        return opal.getColor().replace(opal.getColor(), "White");
    }

    @Override
    public String getTransparency() {
        return opal.getTransparency().replace(opal.getTransparency(),  "Admixture");
    }

    @Override
    public String getDescription() {
        return getColor()+" "+opal.getQuality()+" "+getTransparency();
    }
}
