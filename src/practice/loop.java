package practice;

public class loop {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                System.out.println(numbers[i]);
                System.out.print(numbers[j]);
            }
        }
    }
}