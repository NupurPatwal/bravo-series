package beta_arrays1.mar25;

public class maxSubarrsum_brute {
    public static void maxSubarraysum(int[]arr){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
//        first loop:
        for (int i=0;i<arr.length;i++){
            int start=i;
//            second loop:
            for (int j=i;j<arr.length;j++){
                int end=j;
                currSum=0;
//                third lop:
                for (int k=start;k<=end;k++){ // sum of subarray
//                    print the subarray sum:
                    currSum +=arr[k];
                }
                System.out.println(currSum);
                if (maxSum< currSum){
                    maxSum=currSum;
                }
            }
        }
        System.out.println("The maximum sum is:"+ maxSum);
    }
    public static void main(String[] args) {
        int []number={2,4,6,8,10};
        maxSubarraysum(number);
    }
}
