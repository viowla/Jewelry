package entity.gems;


public class Ruby extends Gem {

    Gem ruby;

    public Ruby(Gem ruby){
        this.ruby=ruby;
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
        return ruby.getColor().replace(getColor(), "Red")+ruby.getQuality()+ruby.getTransparency()+" "+ruby.getCarat();
    }
}
