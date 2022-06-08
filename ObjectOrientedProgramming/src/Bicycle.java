public class Bicycle {

    private String color;

    private String kindOfBreaks;


    public Bicycle() {
    }

    public Bicycle(String color, String kindOfBreaks) {
        this.color = color;
        this.kindOfBreaks = kindOfBreaks;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setkindOfBreaks(String kindOfBreaks) {
        this.kindOfBreaks = kindOfBreaks;
    }

    public String getkindOfBreaks() {
        return kindOfBreaks;
    }
}
