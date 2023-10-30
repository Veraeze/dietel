package array;

import java.util.Scanner;

public class CustomerItem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] info = new int[4][3];
        for (int customer = 0; customer < info.length; customer++) {
            for (int item = 0; item < info[customer].length; item++) {
                System.out.println("Enter price");
                info[customer][item] = input.nextInt();
            }
            System.out.println();
        }
        for (int[] index : info) {
            for (int price : index) {
                System.out.print(price + "    ");
            }
            System.out.println();
        }

    }
}
