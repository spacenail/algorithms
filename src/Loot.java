public class Loot {
    private final String name;
    private final int price;
    private final int weight;

    public Loot(String name, int price, int weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    public int getPrice() {
        return price;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return name +
                " price:" + price +
                ", weight:" + weight;
    }
}
