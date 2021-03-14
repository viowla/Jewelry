package entity.gems;


public class Sapphire extends Gem {

    Gem sapphire;

    public Sapphire(Gem sapphire){
        this.sapphire=sapphire;
    }

    @Override
    public double cost() {
        return 8000.0;
    }

    @Override
    public String getColor() {
        return sapphire.getColor().replace(sapphire.getColor(), "Blue");
    }

    @Override
    public String getDescription() {
        return getColor()+" "+sapphire.getQuality()+" "+sapphire.getTransparency();
    }
}
