package beta_arrays1.mar25;

public class maxSubarrysum_kadanes {
    public static void kadanes(int[]num){
        int ms=Integer.MIN_VALUE;
        int cs=0;
//        loop:
        for (int i=0;i< num.length;i++){
            cs=cs + num[i];
            if (cs<0){
                cs=0;
            }
            ms =Math.max(cs,ms);
        }
        System.out.println("The maximum subarray is ="+ ms);
    }
    public static void main(String[] args) {
        int []num={2,4,6,8,10};
        kadanes(num);
    }
}
