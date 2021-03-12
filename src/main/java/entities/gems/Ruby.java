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

    @Override
    public String color() {
        return "Red";
    }

    public String getRuby() {
        return ruby.color()+ruby.quality()+ruby.transparency();
    }
}
