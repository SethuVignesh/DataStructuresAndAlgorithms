package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public void sort(int[] data) {
        System.out.print(Arrays.toString(data));

        for (int j = 0; j < data.length; j++) {
            int min = data[j];
            int minPos = j;
            for (int i = j; i < data.length; i++) {
                if (data[i] < min) {
                    min = data[i];
                    minPos = i;
                }
            }
            int temp = data[j];
            data[j] = min;
            data[minPos] = temp;


        }

        System.out.print(Arrays.toString(data));

    }
}
