package array;

import java.util.Scanner;

public class CustomerItem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] purchaseInfo = new int[4][3];
        for (int customer = 0; customer < purchaseInfo.length; customer++) {
            for (int item = 0; item < purchaseInfo[customer].length; item++) {
                System.out.println("Enter price");
                purchaseInfo[customer][item] = input.nextInt();
            }
            System.out.println();
        }
        for (int[] index : purchaseInfo) {
            for (int price : index) {
                System.out.print(price + "    ");
            }
            System.out.println();
        }

    }
}
