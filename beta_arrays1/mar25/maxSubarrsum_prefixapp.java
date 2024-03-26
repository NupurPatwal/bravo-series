package beta_arrays1.mar25;

public class maxSubarrsum_prefixapp {
    public static void maxSubarray(int[] arr){
        int curSum=0;
        int maxSum= Integer.MIN_VALUE;
        int [] prefix= new int[arr.length];
        prefix[0]=arr[0];

//        calculate the prefix array:
        for (int i=1; i< prefix.length;i++){
            prefix[i]=prefix[i-1]+ arr[i];
        }
//        first loop:
        for (int i=0;i<arr.length;i++){
            int start=i;
            for (int j=i;j<arr.length;j++){
                int end=j;
//                curSum = prefix[end]-prefix[start];

                curSum =start==0?prefix[end]: prefix[end]-prefix[start-1];
                if (maxSum<curSum){
                    maxSum=curSum;
                }
            }
        }
        System.out.println("The maximum sum is = "+maxSum);
    }
    public static void main(String[] args) {
        int [] num= {2,4,6,8,10};
        maxSubarray(num);
    }
}
