package beta_arrays1.mar25;

public class arrArgument {
    public static void update(int[]arr){
        for (int i=0; i<arr.length;i++){
            arr[i]+=1;
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int []marks= {34,65,21};
        update(marks);
    }
}
