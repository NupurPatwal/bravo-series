package charlie_sorting.mar26;

public class bubble {
    public static void bubbleSort(int[] arr){
        boolean swapped;
//        outer loop:
        for (int turn=0; turn< arr.length-1;turn++){
            swapped= false;
//            inner loop:
            for (int j=0;j< arr.length-1-turn;j++){
                if (arr[j]> arr[j+1]){
//                    swap:
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;
                }
            }
//            if no elements were swapped by the inner loop;
            if (!swapped)
                break;
        }
    }

//     function for traversing the array:
    public static void printArr(int[]arr){
        for (int i=0; i< arr.length;i++){
            System.out.print(arr[i]+",");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int [] arr={5,4,3,1,2};
        bubbleSort(arr);
        printArr(arr);
    }
}
