package entities.gems;

import entities.Mineral;

public class Ruby extends Gems{

    Mineral ruby;

    public Ruby(Mineral ruby){
        this.ruby=ruby;
    }

    @Override
    public double cost() {
        return 10000.0;
    }

    @Override
    public String color() {
        return "Red";
    }

    public String getRuby() {
        return ruby.color()+ruby.quality()+ruby.transparency();
    }
}
