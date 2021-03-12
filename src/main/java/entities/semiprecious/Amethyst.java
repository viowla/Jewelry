package entities.semiprecious;

public class Amethyst extends SemipreciousStones{
    SemipreciousStones amethyst;

    public Amethyst(SemipreciousStones amethyst){
        this.amethyst=amethyst;
    }

    @Override
    public double cost() {
        return 42.0;
    }

    @Override
    public String color() {
        return "Purple";
    }

    @Override
    public String transparency() {
        return "Clear";
    }

    public String getAmethyst() {
        return amethyst.color()+amethyst.quality()+amethyst.transparency();
    }
}
