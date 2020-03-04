package Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] m={1,2,3,0,0,0};
        int[] n={2,5,6};
        merge(m,3,n,3);
    }

    //m [], n[1,2,] return n
    //n[] , return m
    //sorted, nums 1 have enough,     [5678000] nums2[123]
    //[12378000][456]
    //left from right
    // [5678000] nums2[123]

    // nums3[1 0 0 0 0 0 0]
    //j=1, k=1, i=0
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        /*[1,2,3,7,8,0,0,0][4,5,6]
           i                j
          [1,       ]
           k
        */
        int[] nums3 = new int[nums1.length];
        int i = 0;
        int j = 0;
        int k = 0;
        for (; k < nums1.length; k++) {
            if (nums1[i] < nums2[j]) {   // 1<2
                nums3[k] = nums1[i];
                i++;
            } else {
                nums3[k] = nums2[j];
                j++;
            }
            if(i<m==false || j<n ==false) break;

            System.out.println(Arrays.toString(nums3));
        }
        if (i < m) {
            while (i <= m) {
                nums3[k] = nums1[i];
                i++;
                k++;
            }
        }
        if (j < n) {
            while (j <=n) {
                nums3[k] = nums1[j];
                j++;
                k++;
            }

        }
        nums2 = nums3;
        System.out.println(Arrays.toString(nums3));
    }
}

