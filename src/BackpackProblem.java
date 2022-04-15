import java.util.*;

public class BackpackProblem {
    private final Set<List<Loot>> allSets = new HashSet<>();
    private final List<Loot> allItems;
    private final Backpack backpack;

    public BackpackProblem(List<Loot> allItems, Backpack backpack) {
        this.allItems = allItems;
        this.backpack = backpack;
    }

    public List<Loot> getBestSet() {
        calcAllSets(allItems);
        List<List<Loot>> allListSets = new ArrayList<>(allSets);
        int maxSum = calcTotalPrice(allListSets.get(0));
        int idBestSet = 0;
        for (int i = 1; i < allListSets.size(); i++) {
            if (calcTotalWeight(allListSets.get(i)) <= backpack.getMaxWeight()) {
                int currentSum = calcTotalPrice(allListSets.get(i));
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                    idBestSet = i;
                }
            }
        }
        return allListSets.get(idBestSet);
    }

    private int calcTotalPrice(List<Loot> loot) {
        int sum = 0;
        for (Loot l : loot) {
            sum += l.getPrice();
        }
        return sum;
    }

    private int calcTotalWeight(List<Loot> loot) {
        int totalWeight = 0;
        for (Loot l : loot) {
            totalWeight += l.getWeight();
        }
        return totalWeight;
    }

    private void calcAllSets(List<Loot> loot) {
        if (loot.size() > 0) {
            allSets.add(loot);
            for (int i = 0; i < loot.size(); i++) {
                List<Loot> newList = new ArrayList<>(loot);
                newList.remove(i);
                calcAllSets(newList);
            }
        }
    }
}
