package entities.semiprecious;

public class Opal extends SemipreciousStones{
    SemipreciousStones opal;

    public Opal(SemipreciousStones opal){
        this.opal=opal;
    }

    @Override
    public double cost() {
        return 50.0;
    }

    @Override
    public String color() {
        return "White";
    }

    public String getOpal() {
        return opal.color()+opal.quality()+opal.transparency();
    }
}
