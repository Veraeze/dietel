package function;

public class Function {
    public static int rate(int percentage) {

        if (percentage < 50) {
            return percentage * 160 + 5000;
        }
        else if (percentage <= 59) {
            return percentage * 200 + 5000;
        }
        else if (percentage <= 69) {
            return percentage * 250 + 5000;
        }
        else {
            return percentage * 500 + 5000;
        }
    }

    public static int copies(int copies) {
        if (copies>0 && copies<=4) {return 2000;}

        else if (copies > 4 && copies <= 9){return 1800;}

        else if (copies > 9 && copies <= 29){return 1600;}

        else if (copies > 29 && copies <= 49){return 1500;}

        else if (copies > 49 && copies <= 99){return 1300;}

        else if (copies > 99 && copies <= 199){return 1200;}

        else if (copies > 199 && copies <= 499){return 1100;}

        else {return 1000;}
    }

    public static boolean isEven(int integer) {
        if (integer % 2 == 0) {return true;}

        else {return false;}
    }

    public static boolean isPrimeNumber(int integer) {
       int factor = factorOf(integer);
        if (factor == 2) {return true;}
        else {return false;}
    }

    public static int subtract(int firstNumber, int secondNumber){

        if (firstNumber > secondNumber) {return firstNumber-secondNumber;}

        else {return secondNumber - firstNumber;}
    }

    public static double divide(int firstInteger, int secondInteger){

        double result = (double) firstInteger / secondInteger;
        double quotient = Math.round(result * 100.0) / 100.0;

        if (secondInteger != 0) {return quotient;}

        else { return 0;}
    }
    public static int factorOf(int integer){

        int factor = 0;
        int count = 1;
        while ( count <= integer){
            if ( integer % count == 0){
                factor = factor + 1 ;}
            count = count + 1;
        }
        if (factor > 0) {return factor;}
        else {return 0;}
    }

    public static boolean isSquare(int integer) {

        for (int count = 1; count <= integer; count++){
            if (integer / count == count){return true;}
        }
        return false;
    }

    public static boolean isPalindrome(int integer){
        int first = integer / 10000;
        int last = integer % 10;
        if (first == last) {return true;}
        return false;
    }

    public static int factorialOf(int integer) {
        int factorial = 1;
        boolean isNegativeNumber = integer < 0;
        if (isNegativeNumber) return 0;
        int count = integer;
        while (count >= 1){
            factorial *= count;
            count--;
        }
        return factorial;
    }
    public static int multiply(int firstNumber, int secondNumber) {
        int value = 1;
        int result = 0;
        boolean isNegativeNumber = secondNumber < 0;
        boolean isNumberNegative = firstNumber < 0;
        if (isNegativeNumber) {
            for(int count = firstNumber; count >= 1; count--){
            result = result + secondNumber;
        }
        };
        if (isNumberNegative && isNegativeNumber){{ for (int count = (-secondNumber); count >= 1; count--)
        result = result + firstNumber; value = -result;}
        return value;}
        else if(secondNumber > 0) for(int count = secondNumber; count >= 1; count--){
            result = result + firstNumber;
        }

        return  result;
    }

    public static int sumDigits(long n) {
        long first = n % 10;
        long sec = n / 10;
        long second = sec % 10;
        long third = n / 100;
        int sum;
        if (third == 0) {sum = (int)(first + second);}
        sum = (int) (first + second + third);
        return sum;
    }

    public static int minOf(int[] array) {
        int minimum = array[0];
        for (int count = 1; count < array.length; count++){
            if (minimum > array[count]) {minimum = array[count];}
        }
        return minimum;
    }

    public static int maxOf(int[] array){
        int maximum = array[0];
        for (int count = 1; count < array.length; count++) {
            if (maximum < array[count]) maximum = array[count];
        }
        return maximum;
    }

    public static int sumOf(int[] array){
        int total = 0;
        for (int count = 0; count < array.length; count++) {
            total += array[count] ;
        }
        return total;
    }
    public static  double averageOf(int[] array){
        return sumOf(array) / (array.length*1.0);
    }

    public  static int maximumOf(int integer){
        int maximum = 0;
        for (int count = 1; count <= 10; count++) {
            if (maximum < integer) maximum = integer;
        }
        return maximum;
    }

    public static int largestOf(int[] array){
        int largest = array[0];
        for (int count = 1; count < array.length; count++) {
            if (largest < array[count]) largest = array[count];
        }
        return largest;
    }

    public static String reverse(int[] array){
        String reverse = "";
        for (int count = array.length - 1; count >= 0; count--){
            String result = String.valueOf(array[count]);
            reverse += result + " ";
        }
        return reverse;
    }

    public static boolean checkElement(int[] array, int element){
        for (int count = array.length - 1; count >= 0; count--){
            if (array[count] == element)return true;
        }return false;
    }

    public static String oddPositions(int[] array){
        String odd = " ";
        for (int count = 1;count < array.length; count += 2) {
            String number = String.valueOf(array[count]);
            odd += number + " ";
        }
        return odd;
    }

    public static String evenPositions(int[] array){
        String even = " ";
        for (int count = 0;count < array.length; count += 2) {
            String number = String.valueOf(array[count]);
            even += number + " ";
        }
        return even;
    }

    public static String runningTotal(int[] array) {
        int total = 0;
        String result = " ";
        for (int count = 0; count < array.length; count++) {
            total += array[count];
            String value = String.valueOf(total);
            result += value + " ";
        }
        return result;
    }


    public static boolean palindrome(String letters){
        String letter = "";
        for (int count = letters.length() - 1 ; count >= 0; count--){
            char word = letters.charAt(count);
            letter += word;
        }
        return letter.equals(letters);
    }

    public static int forSum(int[] array){
        int sum = 0;
        for (int count : array) {
            sum += array[count];
        }
        return sum;
    }

    public static int whileSum(int[] array){
        int sum = 0;
        int count = 0;
        while (count < array.length) {
            sum += array[count];
            count = count + 1;
        }
        return sum;
    }

    public static int doWhileSum(int[] array){
        int sum = 0;
        int count = 0;
        do {
            sum += array[count];
            count = count + 1;
        } while (count < array.length);
        return sum;
    }

    public static String concatenateLists(String[] letters, int[] numbers){
        StringBuilder firstResult = new StringBuilder("");
        StringBuilder secondResult = new StringBuilder( "");
        for (String count: letters){
            firstResult.append(count).append(",");
        }

        for (int line = 0; line < numbers.length; line++){
            secondResult.append(numbers[line]);
            if (line < numbers.length - 1)secondResult.append(",");
        }
        return "[" + firstResult + secondResult + "]";
    }


    public static String shuffle(char[] letters, int numbers){
        StringBuilder result = new StringBuilder("[");
        numbers = letters.length / 2;
        int news = numbers;
        for (int line = 0; line < numbers; line++){
            result.append(letters[line]).append(", ").append(letters[news]);news = numbers + 1;
            if (line < numbers - 1)result.append(", ");
        }
        result.append(", ").append(letters[news + 1]);
        result.append("]");
        return String.valueOf(result);
    }
    public static String listOfDigits(int digit){
        String number = String.valueOf(digit);
        StringBuilder order = new StringBuilder("[");
        int count = 0;
        while (count < number.length()){
            char letter = number.charAt(count);
            order.append(letter);
            if (count < number.length() - 1)order.append(",");
            count += 1;
            }
        order.append("]");
        return String.valueOf(order);
        }
    }



