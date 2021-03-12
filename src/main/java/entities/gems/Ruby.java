package entities.gems;

public class Ruby extends Gems{

    Gems ruby;

    public Ruby(Gems ruby){
        this.ruby=ruby;
    }

    @Override
    public double cost() {
        return 10000.0;
    }

    public String getRuby() {
        return ruby.color()+ruby.quality()+ruby.transparency();
    }
}
