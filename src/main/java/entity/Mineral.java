package entity;

public abstract class Mineral {

    String quality="High";
    String transparency ="Clear";
    String color = "Colorless";
    int carat=1;

    public String getQuality() {
        return quality;
    }

    public String getTransparency() {
        return transparency;
    }

    public String getColor() {
        return color;
    }

    public int getCarat() {
        return carat;
    }

    public void setCarat(int carat) {
        this.carat = carat;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public void setTransparency(String transparency) {
        this.transparency = transparency;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract double cost();

    public String getDescription(){
        return quality+" "+transparency+" "+color;
    }
}
