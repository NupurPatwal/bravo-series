package beta_arrays1.mar25;

public class searchBinary {
    public static int binarySearch(int[]num,int key){
        int start= 0, end = num.length-1;
//        starting the loop:
        while (start<=end){
            int mid = (start+ end)/2;
//            comparisons:
            if (num[mid]==key){   // key is found
                return mid;
            }
            if (num[mid]<key){   // key in the right
                start=mid+1;
            }else {               // key is in the left
                start=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int []num = {2,4,6,8,10,12};
        int key= 10;
        System.out.println("Index for keys:"+binarySearch(num,key));
    }
}
