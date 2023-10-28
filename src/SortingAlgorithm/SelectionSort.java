package SortingAlgorithm;

import java.util.Arrays;

// Working of selection sort:
        /*
            1. Set the first element as minimum
            2. Compare minimum with the second element. If the second element is smaller
               than minimum, assign the second element as minimum.
            3. Compare minimum with the third element. Again, if the third element is smaller,
               then assign minimum to the third element otherwise do nothing. The process goes on
               until the last element.
            4. After each iteration, minimum is placed in the front of the unsorted list.
        */

public class SelectionSort {

    public void selectionSort(int[] array){
        int size = array.length;

        for(int step = 0; step<size-1;step++){

            int min_index = step;
            for (int i = step+1; i<size;i++){

                if (array[i]< array[min_index]){
                    min_index = i;
                }
            }
            int temp = array[step];
            array[step] = array[min_index];
            array[min_index] = temp;

        }
    }

    public static void main(String[] args) {

        int[] data = {4, 10, 9, 50, 2, 26};
        System.out.println("Unsorted array:");
        for (int i = 0; i< data.length; i++){
            System.out.print(data[i]+"\t");
        }
        SelectionSort ss = new SelectionSort();
        ss.selectionSort(data);
        System.out.println("\nSorted array: "+Arrays.toString(data));





    }
}
