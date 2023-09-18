package cls;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the integer: ");
        int number = input.nextInt();
        int result = 0;
        int count = 1;
        while ( count <= number){

            if ( number % count == 0){
                result = result + 1 ;}
            count = count + 1;
        }
        if (result == 2) System.out.printf("%d is a prime number", number );
        if (result != 2) System.out.printf("%d is not a prime number", number);

    }
}
