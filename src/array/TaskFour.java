package array;

import function.Function;

public class TaskFour  {
    public static void main(String[] args) {
        char[] name = {'A', 'M', 'C', 'W', 'I', 'T'};
        String shuffle = shuffle(name, 3);
        System.out.println(shuffle);
    }

    public static String shuffle(char[] letters, int numbers) {
        StringBuilder result = new StringBuilder("[");
        numbers = letters.length / 2;
        int news = numbers;

        char[] output1 = new char[numbers];
        char[] output2 = new char[numbers];

        for (int count = 0; count < numbers; count++){
            output1[count] = letters[count];
        }

        for (int count2 = news; count2 < letters.length; count2++ ){
            output2[count2 - news] = letters[count2];
            System.out.println(output1.length);
        }

        for (int line = 0; line < numbers; line++) {
            result.append(output1[line]).append(", ").append(output2[line]);
            if (line < numbers - 1) result.append(", ");
        }

        result.append("]");
        return String.valueOf(result);
    }



//    public static String shuffle(char[] letters, int numbers) {
//        StringBuilder result = new StringBuilder("[");
//        numbers = letters.length / 2;
//        int news = numbers;
//
//        for (int line = 0; line < numbers; line++) {
//            result.append(letters[line]).append(", ").append(letters[news]);
//            news = numbers + 1;
//            if (line < numbers - 1) result.append(", ");
//        }
//
//        result.append("]");
//        return String.valueOf(result);
//    }
}