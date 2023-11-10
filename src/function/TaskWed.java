package function;

import array.RemoveDuplicate;

import java.util.ArrayList;

import static array.PrimeFactors.convertToArray;

public class TaskWed {
    public static boolean palindrome(String letters) {
        String word = letters.toUpperCase();
        if (word.charAt(0) == word.charAt(letters.length() - 1)) return true;
        return false;
    }

    public static ArrayList<Integer> store = new ArrayList<>();

    public static int[] remove(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    store.add(numbers[j]);
                }
            }
        }
        return convertToArray(store);
    }

    public static String reverseStrings(String string) {
        String[] splitString = string.split("\\s+");
        StringBuilder reverse = new StringBuilder();
        String result = "";
        int loop = 0;
        for (int count = 0; count < splitString.length; count++) {
            result = splitString[count];
            reverse.append(reverseString(result)).append(" ");
        }
        return String.valueOf(reverse);
    }

    public static String reverseString(String result) {
        StringBuilder reversed = new StringBuilder();
        for (int i = 0; i < result.length(); i++) {
            reversed.insert(0, result.charAt(i));
        }
        return reversed.toString();
    }

    public static ArrayList<Integer> keep = new ArrayList<>();

    public static int[] dominant(int[] array) {

        for (int loop = 0; loop < array.length; loop++) {
            for (int count = loop + 1; count < array.length; count++) {
                if (array[count] > array[loop]) keep.add(array[count]);
            }
        }
        int[] value = convertToArray(keep);
        int[] save = RemoveDuplicate.remove(value);
        return save;
    }

    public static boolean isPalindrome(String integer) {
        if (!integer.matches("\\d+")) {
            System.out.println("invalid: Enter an integer");
            return false;
        }
        int integers = Integer.parseInt(integer);
        int first = (int) ((integers) / Math.pow(10, (countDigit(integers - 1) - 1)));
        int last = (integers) % 10;
        return first == last;
    }

    public static int countDigit(int number) {
        int count = 0;
        while (number != 0) {
            number = number / 10;
            count = count + 1;
        }
        return count;
    }

    public static boolean indices(int number, int target, int start, int stop) {
        int value = countDigit(number);
        int[] array = new int[countDigit(number)];
        for (int count = 0; count < value; count++) {
            array[count] = (int) ((number) / Math.pow(10, (countDigit(number) - 1)));
            if (array[count] < 0) number *= -1;
            number = (int) ((number) % Math.pow(10, (countDigit(number) - 1)));
        }
        return target > array[start] && target < array[stop];
    }
    public static ArrayList<Integer> stores = new ArrayList<>();
    public static ArrayList<Integer> convertIntToArray(int number) {



        if (number != 0) {
            int temp = number % 10;
            number /= 10;
            convertIntToArray(number);
            stores.add(temp);
        }
        return stores;
    }
}

