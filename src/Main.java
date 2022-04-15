import java.util.*;

public class Main {
    public static void main(String[] args) {
        //task1
        /*
        System.out.println(Exponentiation.exp(2,0));
        System.out.println(Exponentiation.exp(2,1));
        System.out.println(Exponentiation.exp(2,2));
        System.out.println(Exponentiation.exp(2,3));
        System.out.println(Exponentiation.exp(2,-1));
        System.out.println(Exponentiation.exp(10,-2));


         */
        //task2
        List<Loot> loot = new LinkedList<>();
        loot.add(new Loot("Notebook",40000,4));
        loot.add(new Loot("Clock",5000,1));
        loot.add(new Loot("Dumbbell",100,5));
        loot.add(new Loot("Guitar",37000,3));
        loot.add(new Loot("Smartphone",10000,2));
        System.out.println(loot);
        BackpackProblem backpackProblem = new BackpackProblem(loot,new Backpack(5));
        System.out.println(backpackProblem.getBestSet());
    }
}
