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
    public String getColor() {
        return ruby.getColor().replace(ruby.getColor(), "Red");
    }

    @Override
    public String getDescription() {
        return getColor()+" "+ruby.getQuality()+" "+ruby.getTransparency();
    }
}
