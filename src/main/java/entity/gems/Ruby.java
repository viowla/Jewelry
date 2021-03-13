package entity.gems;

import entity.Mineral;

public class Ruby extends Gem {

    Gem ruby;

    public Ruby(Gem ruby){
        this.ruby=ruby;
    }

    @Override
    public double cost() {
        return 10000.0;
    }


    public String getRuby() {
        return ruby.getColor().replace(getColor(), "Red")+ruby.getQuality()+ruby.getTransparency();
    }
}
