public class ProductSpecs {
    private String name;
    private int id, price, discountRate, quantity, memory, ram;
    private double screenSize;
    private static int nextId=1;
    private Brand brandOfProduct;

    public ProductSpecs(String name, int price, int discountRate, int quantity, int memory, int ram, double screenSize, Brand brandOfProduct) {
        this.name = name;
        this.price = price;
        this.discountRate = discountRate;
        this.quantity = quantity;
        this.memory = memory;
        this.ram = ram;
        this.screenSize = screenSize;
        this.brandOfProduct = brandOfProduct;
        this.id = nextId;
        nextId++;
    }

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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(int discountRate) {
        this.discountRate = discountRate;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        ProductSpecs.nextId = nextId;
    }

    public Brand getBrandOfProduct() {
        return brandOfProduct;
    }

    public void setBrandOfProduct(Brand brandOfProduct) {
        this.brandOfProduct = brandOfProduct;
    }
}