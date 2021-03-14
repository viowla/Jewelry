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

    public String getDescription() {
        return ruby.getColor().replace(getColor(), "Red")+ruby.getQuality()+ruby.getTransparency()+" "+ruby.getCarat();
    }
}
