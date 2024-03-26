package beta_arrays1.mar25;

public class pairainArray {
    public static void printPairs(int[]numbers){
        for (int i=0; i< numbers.length;i++){
            int curr= numbers[i]; // 2,4,6,7,8,10
            for (int j=i+1; j< numbers.length;j++){
                System.out.print("("+curr+","+ numbers[j]+")");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        int [] num= {2,4,6,7,8,10};
        printPairs(num);
    }
}
