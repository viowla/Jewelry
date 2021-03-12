package entity;

public abstract class Mineral {
    public abstract String quality();
    public abstract String transparency();
    public abstract String color();
    public abstract double cost();
    public  double weightCarat(){
        return 0.2;
    }
}
