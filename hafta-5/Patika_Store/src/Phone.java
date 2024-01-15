import java.util.HashMap;

public class Phone extends ProductSpecs{

    protected String color;
    protected double batteryPower;

    public static HashMap<Integer, Phone> ourPhones = new HashMap<>();

    public Phone(String name, int price, int discountRate, int quantity, int memory, int ram, double screenSize, Brand brandOfProduct, String color, double batteryPower) {
        super(name, price, discountRate, quantity, memory, ram, screenSize, brandOfProduct);
        this.color = color;
        this.batteryPower = batteryPower;

        ourPhones.put(this.getId(), this);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getBatteryPower() {
        return batteryPower;
    }

    public void setBatteryPower(double batteryPower) {
        this.batteryPower = batteryPower;
    }
}