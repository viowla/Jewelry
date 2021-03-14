package entity.gems;

public class Emerald extends Gem {
    Gem emerald;

    public Emerald(Gem emerald){
        this.emerald=emerald;
    }

    @Override
    public double cost() {
        return 5400.0;
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
        return emerald.getColor().replace(getColor(), "Green")+emerald.getQuality()+emerald.getTransparency()+" "+emerald.getCarat()      ;
    }
}
