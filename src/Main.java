import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Notebook[] notebooks = new Notebook[10];
        for (int i = 0; i < notebooks.length; i++) {
            notebooks[i] = new Notebook();
            System.out.println(notebooks[i]);
        }

        long start = System.currentTimeMillis();
        MySort.sort(notebooks);
        long executionTime = System.currentTimeMillis() - start;
        for (int i = 0; i < notebooks.length; i++) {
            System.out.println(notebooks[i]);
        }
        System.out.printf("Time: %d ms",executionTime);
    }
}
