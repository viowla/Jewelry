package entity.gems;


public class Sapphire extends Gem {

    Gem sapphire;

    public Sapphire(Gem sapphire){
        this.sapphire=sapphire;
    }

    @Override
    public double cost() {
        return 10000.0;
    }

    @Override
    public String getDescription() {
        return sapphire.getColor().replace(getColor(), "Blue")+sapphire.getQuality()+sapphire.getTransparency()+" "+sapphire.getCarat();
    }
}
