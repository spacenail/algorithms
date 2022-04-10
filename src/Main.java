import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Notebook> notebooks = new ArrayList<>(10000);
        for (int i = 0; i < 10000; i++) {
            notebooks.add(new Notebook());
        }


    }
}
