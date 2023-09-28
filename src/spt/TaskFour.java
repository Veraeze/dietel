package spt;

import java.util.Scanner;

public class TaskFour {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        for (int count = 1; count <= 10; count++){
            if (count % 2 == 0){
            sum += count;}
        }
        System.out.printf("The sum of even numbers between 1 and 10 is %d", sum);
}
}
