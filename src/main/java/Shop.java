import java.util.ArrayList;

public class Shop {

    private String name;
    private double till;
    private ArrayList<ISell> stock;

    public Shop (String name, double till){
        this.name = name;
        this.till = till;
        this.stock = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTill() {
        return till;
    }

    public void setTill(double till) {
        this.till = till;
    }

    public ArrayList<ISell> getStock() {
        return stock;
    }

    public void setStock(ArrayList<ISell> stock) {
        this.stock = stock;
    }

    public void addItem(ISell item){
        this.stock.add(item);
        this.till -= ((Instrument) item).getPrice();
    }

    public void sellItem(ISell item){
        this.stock.remove(item);
        this.till += ((Instrument) item).getSellingPrice();
    }
}
