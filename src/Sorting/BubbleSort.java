package Sorting;

import java.util.Arrays;

public class BubbleSort {

    public void bubbleSort(int[] data) {

        System.out.print(Arrays.toString(data));

        for (int i = 0; i < data.length-1; i++) {
            for (int j = i+1; j < data.length; j++) {

                if (data[i] > data[j]) {
                    swap(data, i, j);
                }
            }
        }
        System.out.print(Arrays.toString(data));
    }

    private void swap(int[] data, int iPos, int jPos) {
        int k = data[iPos];
        data[iPos] = data[jPos];
        data[jPos] = k;
    }

}
