package alpha_basics.mar25_basics01;

import java.util.Scanner;
///        output the average of 3 numbers:
public class output_Average {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int firstNum= sc.nextInt();
        System.out.println("Enter the first number:");
        int secNum= sc.nextInt();
        System.out.println("Enter the first number:");
        int thirdNum= sc.nextInt();
        int ave= (firstNum+secNum+thirdNum)/3;
        System.out.println("The average is "+ ave);
    }
}
