package beta_arrays1.mar25;

public class linearSearch {
    public static int searchLinear(int [] num, int key){
        for (int i=0; i< num.length;i++){
            if (num[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int []number={3,6,9,12,15,18,21};
        int key=15;
        System.out.println(searchLinear(number,key));
    }
}
