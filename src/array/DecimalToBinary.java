package array;

import java.util.ArrayList;
import java.util.Arrays;

import static function.TaskWed.convertIntToArray;
import static function.TaskWed.reverseString;

public class DecimalToBinary {
    public static ArrayList<Integer> store = new ArrayList<>();

    public static int decimalToBinary(int number){
        int remain1 = number % 2;
        store.add(remain1);
        int value = number / 2;
         do {
             int remain2 = value % 2;
             store.add(remain2);
            value = value / 2;
        }while (value > 0);
        return Integer.parseInt(reverseString(convertArrayListToString(store)));
    }

    public static int binaryToDecimal(int number){
        ArrayList<Integer> arrayNumber = convertIntToArray(number);
        int value = 1;
        int result = 0;
        for (int count = 0; count < arrayNumber.size(); count++){
            value = (int) (Math.pow(2, count) * arrayNumber.get((arrayNumber.size() - 1) - count));
            result += value;
        }
        return result;
    }

    public static String convertArrayListToString(ArrayList<Integer> array){
        StringBuilder convert = new StringBuilder();
        for (int loop = 0; loop < array.size(); loop++){
            convert.append(array.get(loop).toString());
        }
        return convert.toString();
    }

    public static char[] alphabets() {
        char [] chars = new char[26];
        int count = 0;
        for (char letter = 'A'; letter <= 'Z'; letter++){
            chars[count] = letter;
            count++;
        }
        System.out.println(chars);
        return chars;
    }
    public static char[] encrypt(int key){
        char[] encryptAlphabets = alphabets();
        char[] keyAlphabets = alphabets();
        int encrypt = 0;
        for (int count = 0; count < 25; count++){
            if (count == key + 1){
                encryptAlphabets[count] = keyAlphabets[encrypt + count];
            }
            else {
                encryptAlphabets[count] = encryptAlphabets[key + count];
            }
        }
        return encryptAlphabets;
    }

    public static void main(String[] args) {
        char[] letters = alphabets();
        char[] encrypt = encrypt(14);
        System.out.println(Arrays.toString(letters) + "\n" + Arrays.toString(encrypt));
    }
}