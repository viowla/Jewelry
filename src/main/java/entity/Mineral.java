package entity;

public abstract class Mineral {

    String quality="High";
    String transparency ="Clear";
    String color = "Colorless";
    double carat=0.2;

    public String getQuality() {
        return quality;
    }

    public String getTransparency() {
        return transparency;
    }

    public String getColor() {
        return color;
    }

    public double getCarat() {
        return carat;
    }

    public abstract double cost();

}
