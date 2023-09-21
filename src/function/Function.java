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
        int result = 0;
        int count = 1;
        while ( count <= integer){
            if ( integer % count == 0){
                result = result + 1 ;}
            count = count + 1;
        }
        if (result == 2) {return true;}
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
        int count = 1;
        while (count <= integer){
            factorial *= count;
            count++;
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
}