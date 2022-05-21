import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public abstract class Instrument implements IPlay, ISell{

    private String name;
    private String colour;
    private String type;
    private ArrayList<String> materials;
    private double price;
    private IPlay play;
    private String sound;
    private double sellingPrice;

    public Instrument(String name, String colour, String type,  double price, double sellingPrice, String sound) {
        this.name = name;
        this.colour = colour;
        this.type = type;
        this.materials = new ArrayList<>();
        this.price = price;
        this.sellingPrice = sellingPrice;
        this.sound = sound;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ArrayList<String> getMaterials() {
        return materials;
    }

    public void setMaterials(ArrayList<String> materials) {
        this.materials = materials;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String play(String sound) {
        return sound;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public String calculateMarkup(double price, double sellingPrice) {
        double difference = sellingPrice - price;
        double number = price / difference;
        double percent = 100.00 / number;
        return "The markup on this item is: " + percent + "%.";
    }

}
