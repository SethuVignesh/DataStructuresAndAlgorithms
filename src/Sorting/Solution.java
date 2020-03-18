package Sorting;

public class Solution {
    public static void main(String[] args) {
        int data[] = new int[]{7, 6, 54, 3, 2, 2};
//        BubbleSort bubbleSort= new BubbleSort();
//        bubbleSort.bubbleSort(data);
//        InsertionSort insertionSort= new InsertionSort();
//        insertionSort.sort(data);

        SelectionSort selectionSort= new SelectionSort();
        selectionSort.sort(data);
    }
}
