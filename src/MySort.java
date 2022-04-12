public class MySort {
    public static void doubleSelectionSort(Notebook[] array) {
        //int k = array.length - 1;
        for (int i = 0; i < array.length; i++) {
            int min = i;
            //int max = k;
            for (int j = min + 1; j < array.length; j++) {
                if (array[j].compareTo(array[min]) < 0) {
                    min = j;
                }
            }
            Notebook temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }
}


//20 10 4 0 22 1
// 0  1 2 3 4  5
/*
min = 20(0)
max = 1(5)
22 > max max = 22(4)
10<min min = 10
4<min min = 4
0<min min = 0(3)
i(3) = i(0)
i(0) = i(3)
i(5) = i(4)
i(4) = i(5)

 for (int j = min + 1; j < array.length; j++) {

                if (array[j].getPrice() < array[min].getPrice()) {
                    min = j;
                }
                if (array[j].getPrice() > array[max].getPrice()) {
                    max = j;
                }
            }
            Notebook temp = array[i];
            array[i] = array[min];
            array[min] = temp;
 */
