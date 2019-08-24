

public abstract class Part {

    // Private members
    protected int id;
    protected double price;
    protected int stock;
    protected int min;
    protected int max;
    protected String name;

    // Class Constructor
    public Part(int id, double price, int stock, int min, int max, String name) {
        this.id = id;
        this.price = price;
        this.stock = stock;
        this.min = min;
        this.max = max;
        this.name = name;
    }

    // Getters & Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setPrice(int max) {
        this.max = max;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }





}
