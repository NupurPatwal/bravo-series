package beta_arrays1.mar25;

public class subArrays {
    public static void printSubarrays(int[]arr){
//        first loop:
        for (int i=0;i< arr.length;i++){
            int start=i;
//            inner loop:
            for (int j=i;j<arr.length;j++){
                int end=j;
//                second inner loop:
                for (int k=start; k<=end; k++){
                    System.out.print(arr[k]+",");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int []num={2,4,6,7,8,10};
        printSubarrays(num);
    }
}
