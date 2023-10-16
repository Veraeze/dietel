package array;

import java.util.*;

public class MBTI2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] questionJP = {"organized, orderly", "flexible, adaptable",
                                "plan, schedule", "unplanned, spontaneous",
                                "regulated, structured", "easy-going, live and let live",
                                "preparation, plan ahead", "go with the flow, adapt as you go",
                                "control, govern", "latitude, freedom"};

        String[] result = new String[questionJP.length /2];

        for (int loop = 0; loop < questionJP.length; loop+=2){
            System.out.println("A. " + questionJP[loop] + "          B. " + questionJP[loop+1]);
            String answer = input.nextLine().toUpperCase();
            while (!(answer.equals("A") || answer.equals("B"))){
                System.out.println("Expected A or B as response \n I know this is an error please try again");
                System.out.println("A. " + questionJP[loop] + "          B. " + questionJP[loop+1]);
                answer = input.nextLine().toUpperCase();
            }
            result[loop / 2] = answer;

        }
        int first = 0;
        int second = 0;
        for (int count = 0; count < result.length; count++) {
            if (result[count].equals("A")) {
                first += 1;
            } else if (result[count].equals("B")) {
                second += 1;
            }
        }
        System.out.println("The number of A is " + first + "\n" + "The number of B is " + second);

    }
    public static String output(){
        StringBuilder store = new StringBuilder();
        String change = store.toString();
        String[] change2 = change.split("\n");
        int first = 0;
        int second = 0;
        for (int count = 0; count < result.length; count++) {
            System.out.println(change2[count]);
            if (result[count].equals("A")) {
                first += 1;
            } else if (result[count].equals("B")) {
                second += 1;
            }
        }
        System.out.println("The number of A is " + first + "\n" + "The number of B is " + second);
    }
}