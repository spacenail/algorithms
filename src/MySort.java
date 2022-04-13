import java.util.Arrays;

public class MySort {
    public static <T extends Comparable<T>> void  doubleSelectionSort(T[] array) {
        int half;
        if (array.length % 2 == 0) {
            half = array.length / 2;
        } else {
            half = array.length / 2 + 1;
        }
        int k = array.length - 1;
        for (int i = 0; i < half; i++, k--) {
            int min = i;
            int max = k;
            int l = k - 1;
            for (int j = min + 1; j < array.length; j++) { // поиск минимума и максимума
                if (array[j].compareTo(array[min]) < 0) {
                    min = j;
                }

                if (array[l].compareTo(array[max]) > 0) {
                    if(l == i){ // если максимум совпадает с позицией, которую меняем на минимум, то меняем с итогом перестановки
                        max = min;
                    } else {
                        max = l;
                    }
                }
                l--;
            }
            T temp1 = array[i];
            array[i] = array[min];
            array[min] = temp1;
            //System.out.println("iteration swap min: " + Arrays.toString(array));


            T temp2 = array[k];
            array[k] = array[max];
            array[max] = temp2;
            //System.out.println("iteration swap max: " + Arrays.toString(array));
        }
    }
}