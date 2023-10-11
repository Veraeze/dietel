package array;

import java.util.ArrayList;
import java.util.Scanner;

public class AtmCard {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Hello, Kindly Enter Card details to verify: ");
        long cardNumber = input.nextLong();
        String card = String.valueOf(cardNumber);

        ArrayList<Long> digits = new ArrayList<>();

        int number = 0;
        while (number < card.length()){
            long start = (long) (cardNumber / Math.pow(10, number) % 10);
            digits.add(start);
            number++;}

        int oneDigit = 0;
        int twoDigits = 0;
        long doubleDigits = 0;

        for (int even = 1; even < card.length(); even += 2){
            long value = digits.get(even);
            long productValue = value * 2;
            if (productValue >= 10 && productValue <= 99){
                doubleDigits = productValue;
                int iterate = 2;
                while (iterate > 0){
                    iterate--;
                    int out = (int)(doubleDigits / Math.pow(10,iterate) % 10);
                    twoDigits += out;
                }
            } else {
                oneDigit += (int) productValue;
            }
        }

        int evenSum  = twoDigits + oneDigit;
        int oddSum = 0;

        for (int odd = 0; odd < card.length(); odd += 2) {
            int result = Math.toIntExact(digits.get(odd));
            oddSum += result;
        }

        int totalSum = evenSum + oddSum;
        int firstIndex = digits.size()-1;
        int secondIndex = digits.size()-2;
        long checkIndex = digits.get(firstIndex);
        long checkIndex2 = digits.get(secondIndex);
        String cardType = "";
        String checkStatus = "";

        if (checkIndex == 5 && card.length() >= 13 && card.length() <= 16 && totalSum % 10 == 0) {
            cardType = "MasterCard";
            checkStatus = "Valid";
        } else if (checkIndex == 5 && card.length() >= 13 && card.length() <= 16 && totalSum % 10 != 0) {
            cardType = "MasterCard";
            checkStatus = "InValid";
        }

        if(checkIndex == 3 && checkIndex2 == 7 && card.length() >= 13 && card.length() <= 16 && totalSum % 10 == 0){
            cardType = "American Express Card";
            checkStatus = "Valid";
        } else if(checkIndex == 3 && checkIndex2 == 7 && card.length() >= 13 && card.length() <= 16 && totalSum % 10 != 0)  {
            cardType = "American Express Card";
            checkStatus = "InValid";
        }

        if(checkIndex == 6 && card.length() >= 13 && card.length() <= 16 && totalSum % 10 == 0){
            cardType = "Discover Card";
            checkStatus = "Valid";
        } else if(checkIndex == 6 && card.length() >= 13 && card.length() <= 16 && totalSum % 10 != 0) {
            cardType = "Discover Card";
            checkStatus = "InValid";
        }

        if (checkIndex == 4 && card.length() >= 13 && card.length() <= 16 && totalSum % 10 == 0 ){
            cardType = "Visa Card";
            checkStatus = "Valid";
        } else if (checkIndex == 4 && card.length() >= 13 && card.length() <= 16 && totalSum % 10 != 0) {
            cardType = "American Express Card";
            checkStatus = "InValid";
        }

        if(checkIndex < 3 || checkIndex > 6){
            cardType = "Invalid Card";
            checkStatus = "InValid";
        }

        System.out.printf("""
*****************************************
**Credit Card Type: %s
**Credit Card Number: %d
**Credit Card Digit Length: %d
**Credit Card Validity Status: %s
********************************************\s
%n         \s
""",cardType,cardNumber,card.length(),checkStatus);
    }
}
