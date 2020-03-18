package DynamicPrgm;

public class Solution {
    public static void main(String[] args) {
        ContiguousSum contiguousSum = new ContiguousSum();
        int[] arr= new int[]{1,2,3,4,5,5,6};
        int k=5;
        boolean isContiguousAvailable= contiguousSum.checkSubarraySumDP(arr,k);
        System.out.println("isContiguousAvailable"+isContiguousAvailable);

    }
}
