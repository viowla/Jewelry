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

    @Override
    public String color() {
        return "Blue";
    }

    public String getSapphire() {
        return sapphire.color()+sapphire.quality()+sapphire.transparency();
    }
}
