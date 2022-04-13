public class Main {
    public static void main(String[] args) {
        Notebook[] notebooks = new Notebook[10000];
        for (int i = 0; i < notebooks.length; i++) {
            notebooks[i] = new Notebook();
        }

        long start = System.currentTimeMillis();
        MySort.doubleSelectionSort(notebooks);
        long executionTime = System.currentTimeMillis() - start;

        System.out.printf("Time: %d ms",executionTime);
    }
}
