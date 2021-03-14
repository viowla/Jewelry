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
    public String getQuality() {
        return super.getQuality();
    }

    @Override
    public String getTransparency() {
        return super.getTransparency();
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public int getCarat() {
        return super.getCarat();
    }

    @Override
    public void setCarat(int carat) {
        super.setCarat(carat);
    }

    public String getDescription() {
        return sapphire.getColor().replace(getColor(), "Blue")+sapphire.getQuality()+sapphire.getTransparency()+" "+sapphire.getCarat();
    }
}
