package entities.semiprecious;

public class Garnet extends SemipreciousStones{
    SemipreciousStones garnet;

    public Garnet(SemipreciousStones garnet){
        this.garnet=garnet;
    }

    @Override
    public double cost() {
        return 60.0;
    }

    @Override
    public String color() {
        return "Dark red";
    }

    @Override
    public String transparency() {
        return "Clear";
    }

    public String getGarnet() {
        return garnet.color()+garnet.quality()+garnet.transparency();
    }
}
