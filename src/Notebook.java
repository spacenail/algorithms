import java.util.Random;

public class Notebook implements Comparable<Notebook> {
    private final int price;
    private final int memory;
    private final String vendor;
    private final int vendorId;
    private final Random rnd = new Random();
    private int id;
    private static int count = 0;
    private final String[] vendors = {"Lenuvo", "Asos", "MacNote", "Eser", "Xamiou"};

    public Notebook() {
        price = getRandom(500, 2000, 50);
        memory = getRandom(4, 24, 4);
        vendorId = rnd.nextInt(vendors.length - 1);
        vendor = vendors[vendorId];
        count++;
        id = count;
    }

    public Notebook(int price, int memory, String vendor, int vendorId) {
        this.price = price;
        this.memory = memory;
        this.vendor = vendor;
        this.vendorId = vendorId;
    }

    private int getRandom(int min, int max, int grid) {
        int temp = rnd.nextInt(max - min + 1) + min;
        return temp - (temp % grid);
    }

    @Override
    public String toString() {
        return "id: " + id +
                ", price: " + price +
                ", memory: " + memory +
                ", vendor: '" + vendor + '\'';
    }

    @Override
    public int compareTo(Notebook n) {
        int comparePriceResult = comparePrice(n);
        if (comparePriceResult == 0) { // цена равна
            int compareMemoryResult = compareMemory(n);
            if (compareMemoryResult == 0) { // количество памяти равно
                int compareVendorResult = compareVendor(n);
                if (compareVendorResult == 0) { // одинаковый производитель
                    return 0;
                } else {
                    return compareVendorResult;
                }
            } else {
                return compareMemoryResult;
            }
        } else {
            return comparePriceResult;
        }
    }


    private int comparePrice(Notebook n) {
        if (this.price > n.price) {
            return 1;
        } else if (this.price < n.price) {
            return -1;
        } else {
            return 0;
        }
    }

    private int compareMemory(Notebook n) {
        if (this.memory > n.memory) {
            return 1;
        } else if (this.memory < n.memory) {
            return -1;
        } else {
            return 0;
        }
    }

    private int compareVendor(Notebook n) {
        if (this.vendorId > n.vendorId) {
            return 1;
        } else if (this.vendorId < n.vendorId) {
            return -1;
        } else {
            return 0;
        }
    }
}
