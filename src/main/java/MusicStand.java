public class MusicStand implements ISell{

    private String description;
    private double price;
    private double sellingPrice;
    private String colour;

    public MusicStand(String description, String colour, double price, double sellingPrice){
        this.description = description;
        this.colour = colour;
        this.price = price;
        this.sellingPrice = sellingPrice;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
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
        String result = String.format("%.2f", percent);
        return "The markup on this item is: " + result + "%.";
    }
}
