import java.util.Random;

public class Notebook {
    private final int price;
    private final int memory;
    private final String vendor;
    private final String[] vendors = {"Lenuvo", "Asos", "MacNote", "Eser", "Xamiou"};
    private final Random rnd = new Random();

    public Notebook() {
        price = getRandom(500, 2000, 50);
        memory = getRandom(4, 24, 4);
        vendor = vendors[rnd.nextInt(vendors.length - 1)];
    }

    public Notebook(int price, int memory, String vendor) {
        this.price = price;
        this.memory = memory;
        this.vendor = vendor;
    }

    public int getPrice() {
        return price;
    }

    public int getMemory() {
        return memory;
    }

    public String getVendor() {
        return vendor;
    }

    private int getRandom(int min, int max, int grid) {
        int temp = rnd.nextInt(max - min + 1) + min;
        return temp - (temp % grid);
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "price=" + price +
                ", memory=" + memory +
                ", vendor='" + vendor + '\'' +
                '}';
    }
}
