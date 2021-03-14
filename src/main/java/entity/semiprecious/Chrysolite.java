package entity.semiprecious;

public class Chrysolite extends SemipreciousStone {
    SemipreciousStone chrysolite;

    public Chrysolite(SemipreciousStone chrysolite){
        this.chrysolite=chrysolite;
    }

    @Override
    public double cost() {
        return 170.0;
    }

    @Override
    public String getColor() {
        return chrysolite.getColor().replace(chrysolite.getColor(), "Olive");
    }

    @Override
    public String getDescription() {
        return getColor()+" "+chrysolite.getQuality()+" "+chrysolite.getTransparency();
    }
}
