package entity.gems;


public class Diamond extends Gem {

    Gem diamond;

    public Diamond(Gem diamond){
        this.diamond=diamond;
    }

    @Override
    public double cost() {
        return 5400.0;
    }


    @Override
    public String getDescription() {
        return diamond.getColor()+" "+diamond.getQuality()+" "+diamond.getTransparency();
    }
}
