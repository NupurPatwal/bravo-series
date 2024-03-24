package alpha_basics.functions;

import java.util.Scanner;

public class evenOdd {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any number:");
        int number = sc.nextInt();
        System.out.println(isEven(number));
    }
    public static boolean isEven(int a){
        if (a%2==0){
            return true;
        }else {
            return false;
        }
    }
}
