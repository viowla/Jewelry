package entities.gems;

public class Sapphire extends Gems{

    Gems sapphire;

    public Sapphire(Gems sapphire){
        this.sapphire=sapphire;
    }

    @Override
    public double cost() {
        return 10000.0;
    }

    public String getSapphire() {
        return sapphire.color()+sapphire.quality()+sapphire.transparency();
    }
}
