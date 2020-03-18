package Sorting;

import java.util.Arrays;

public class InsertionSort {
    public void sort(int[] data) {
        System.out.println(Arrays.toString(data));
        //start from second element
        //loop from first insert at proper
        //shift all elemtn

        System.out.println(Arrays.toString(data));

        for (int i = 1; i < data.length; i++) {
            for(int j=i;j>0;j--){
                if(data[j]<data[j-1]){
                    int temp= data[j];
                    data[j]=data[j-1];
                    data[j-1]=temp;
                }else{
                    continue;
                }
            }
        }
        System.out.println(Arrays.toString(data));
    }
}
