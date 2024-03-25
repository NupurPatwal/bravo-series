package beta_arrays1.mar25;

public class reverse {
    public static void reverseArr(int []numbers){
        int first= 0, last= numbers.length-1;
//        initating the loop:
        while (first<last){
//            swapping:
            int temp=numbers[last];
            numbers[last]=numbers[first];
            numbers[first]=temp;
            first++;
            last--;
        }
    }
    public static void arr(int []num){
        //         loop for printing the array:
        for (int i=0; i<num.length;i++){
            System.out.println(num[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] num = {2, 4, 6, 8, 10};
        reverseArr(num);
        //         loop for printing the array:
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i] + " ");
//        arr(num);
        }
    }
}
