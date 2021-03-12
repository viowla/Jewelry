package entities.semiprecious;

public class Amethyst extends SemipreciousStones{
    @Override
    public String quality() {
        return super.quality();
    }

    @Override
    public String transparency() {
        return "Clear";
    }

    @Override
    public String color() {
        return super.color();
    }

    @Override
    public double cost() {
        return 42.0;
    }

    @Override
    public double weightCarat() {
        return super.weightCarat();
    }
}
