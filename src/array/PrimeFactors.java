package array;

import java.util.ArrayList;
import java.util.Arrays;



public class PrimeFactors {

 static int numberOfFactor(int integer) {
        int factor = 0;
        int count = 1;
        while (count <= integer) {
            if (integer % count == 0) {
                ++factor;
            }
            count++;
        }
        return factor;
    }

    public static boolean primeNumber(int integer) {
        return numberOfFactor(integer) == 2;
    }

    public static int[] factorArray(int integer) {
        int counter = 0;
        int check = 1;
        int factor = numberOfFactor(integer);
        int[] save = new int[factor];
        while (check <= integer) {
            if ((integer % check == 0)) {
                save[counter] = check;
                counter++;
            }
            check++;
        }
        return save;
    }

    public static int primeProduct(int number) {
        int[] newNumbers = factorArray(number);
        int product = 1;
        for (int newNumber : newNumbers) {
            if (primeNumber(newNumber)) product *= newNumber;
        }
        return product;
    }

    public static ArrayList<Integer> values = new ArrayList<>();
    public static int[] primeFactors(int... number) {
        int[] newNumbers = factorArray(number.length);
        for (int newNumber= 0; newNumber < newNumbers.length; newNumber++) {
            if (primeNumber(number[newNumber])) values.add(number[newNumber]);
        }
        return convertToArray(values);
    }

    public static int[] convertToArray(ArrayList<Integer> values) {
        int[] value = new int[values.size()];
        for (int count = 0; count < value.length; count++){
            value[count] = values.get(count);
        }
        return value;
    }

    public static int[] highestCommonFactors(int... numbers) {
        int loop = 2;
        int count = 0;
        int remain = 0;
        while (loop < numbers[count]) {
            if (primeNumber(loop)) {
                    remain = numbers[count] / loop;
                    loop++;
                    count++;

            }
            System.out.println(Arrays.toString(numbers));
        }
        return numbers;
    }
}

