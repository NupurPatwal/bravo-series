package alpha_basics.mar25_basics01;

import java.util.Scanner;

public class item_gst {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter pen cost:");
        int pen= sc.nextInt();
        System.out.println("Enter pencil cost:");
        int pencil= sc.nextInt();
        System.out.println("Enter erasor cost:");
        int erasor= sc.nextInt();
        int totalCost= (pen+ pencil+erasor);
        totalCost+= (int) (totalCost*0.18);
        System.out.println("The total cost of item is Rs."+totalCost+" approx");
    }
}
