package entities.gems;

public class Diamond extends Gems{

    Gems diamond;

    public Diamond(Gems diamond){
        this.diamond=diamond;
    }

    @Override
    public double cost() {
        return 5400.0;
    }

    public String getDiamond() {
        return diamond.color()+diamond.quality()+diamond.transparency();
    }
}
