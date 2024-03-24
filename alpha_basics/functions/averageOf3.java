package alpha_basics.functions;

import java.util.Scanner;

public class averageOf3 {
    public static int average(int a, int b, int c){
         return (a+b+c)/3;
            }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first no.");
        int a= sc.nextInt();
        System.out.println("Enter the sec no.");
        int b= sc.nextInt();
        System.out.println("Enter the third no.");
        int c= sc.nextInt();

        System.out.println("The sum of 3 no.s is average is "+ average(a,b, c));

    }
}
