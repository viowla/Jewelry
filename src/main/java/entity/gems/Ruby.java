package entity.gems;

import entity.Mineral;

public class Ruby extends Gem {

    Mineral ruby;

    public Ruby(Mineral ruby){
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
