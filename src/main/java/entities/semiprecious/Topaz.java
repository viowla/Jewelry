package entities.semiprecious;

public class Topaz extends SemipreciousStones{
    SemipreciousStones topaz;

    public Topaz(SemipreciousStones topaz){
        this.topaz=topaz;
    }

    @Override
    public double cost() {
        return 60.0;
    }

    @Override
    public String transparency() {
        return "Clear";
    }

    @Override
    public String color() {
        return "Yellow";
    }

    public String getTopaz() {
        return topaz.color()+topaz.quality()+topaz.transparency();
    }
}
