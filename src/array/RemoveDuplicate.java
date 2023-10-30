package array;

public class RemoveDuplicate {
    public  static int[] remove(int[] numbers){
        for (int i = 0; i < numbers.length; i++){
            for (int j = i + 1; j < numbers.length; j++){
                if (numbers[i] == numbers[j]){
                    numbers[j] = 0;
                }
            }
        }
        int length = countUniqueValues(numbers);
        numbers = stripArray(numbers, length);
        return  numbers;
    }
    public static int[] stripArray(int[] numbers, int length){
        int[] array = new int[length];
        int count = 0;
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] != 0){
                array[count] = numbers[i];
                count++;
            }
        }
        return array;
    }

    public static int countUniqueValues(int[] numbers){
        int length = 0;
        for (int i = 0; i< numbers.length; i++){
            if (numbers[i] != 0){
                length++;
            }
        }
        return  length;
    }
}
