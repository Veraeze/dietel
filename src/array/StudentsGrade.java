package array;


public class StudentsGrade {

    }



























//        Scanner input = new Scanner(System.in);
//
//        System.out.println("How many students do you have? ");
//        String students = input.nextLine();
//        while (!students.matches("\\d+")) {
//            System.out.println("Error!. The number of student(s) must consist of positive number(s) only \nPlease try again");
//            students = input.nextLine();
//        }
//        int pupils = 0;
//        if (students.matches("\\d+")) {
//            pupils = Integer.parseInt(students);
//        }
//        while (pupils == 0) {
//            System.out.println("Error!. The number of student(s) must be greater than 0 \nPlease try again");
//            students = input.nextLine();
//            if (students.matches("\\d+")) {
//                pupils = Integer.parseInt(students);
//            }
//        }
//
//
//        System.out.println("How many subjects do they offer");
//        String subjects = input.nextLine();
//        while (!subjects.matches("\\d+")) {
//            System.out.println("Error!. The number of subject(s) must consist of positive number(s) only \nPlease try again");
//            students = input.nextLine();
//        }
//        int course = 0;
//        if (subjects.matches("\\d+")) {
//            course = Integer.parseInt (subjects);
//        }
//        while (course == 0) {
//            System.out.println("Error!. The number of subject(s) must be greater than 0 \nPlease try again");
//            students = input.nextLine();
//            if (students.matches("\\d+")) {
//                course = Integer.parseInt(subjects);
//            }
//        }
//        int[][] gradeSheet = new int[pupils][course];
//        ArrayList<Integer> addValues = new ArrayList<>();
//        ArrayList<Double> averageValue = new ArrayList<>();
//        for (int student = 0; student < pupils; student++) {
//            int total = 0;
//            double average = 0;
//            for (int subject = 0; subject < course; subject++) {
//                System.out.printf("Entering score for student %d %nEnter score for subject %d%n", (student + 1), (subject + 1));
//                gradeSheet[student][subject] = input.nextInt();
//                save();
//                while (!(gradeSheet[student][subject] >= 0 && gradeSheet[student][subject] <= 100)) {
//                    System.out.println("Expected score between 1 - 100 \nI know this is an error please try again");
//                    System.out.printf("Entering score for student %d %nEnter score for subject %d%n%n saving>>>>>>>>>>>>>>>>%nSaved successfully", (student + 1), (subject + 1));
//                    gradeSheet[student][subject] = input.nextInt();
//                }
//                total += gradeSheet[student][subject];
//                average = (double) total / pupils;
//            }
//            addValues.add(total);
//            averageValue.add(average);
//            System.out.println();
//        }
//        dash();
//        System.out.printf("%-15s", "STUDENT");
//        for (int title = 0; title < course; title++) {
//            System.out.printf("%-16s", "SUB" + (title + 1));
//        }
//        System.out.printf("%-16s", " TOT ");
//        System.out.printf("%-10s", " AVE ");
//        System.out.printf("%-10s%n", " POS ");
//        dash();
//        for (int first = 0; first < gradeSheet.length; first++) {
//            System.out.printf("%n%-16s", "Student " + (first + 1));
//            for (int second = 0; second < gradeSheet[first].length; second++) {
//                System.out.printf("%-16d", gradeSheet[first][second]  );
//            }
//
//            System.out.printf("%-16s", addValues.get(first));
//            System.out.printf("%-10s", averageValue.get(first));
//            System.out.println();
//        }
//        dash();
//    }
//    public static void save(){
//        System.out.println("""
//                Saving >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
//                Saved successfully
//                """);
//    }
//
//    public static void dash() {
//        for (int count = 0; count < 2; count++) {
//            for (int count2 = 0; count2 < 105; count2++) {
//                System.out.print("-");
//            }
//            System.out.println();
//        }
//    }
//
//    public static ArrayList<String> maxSubject = new ArrayList<String>();
//    public static ArrayList<String> minSubject = new ArrayList<String>();
//
//    public static ArrayList<Integer> calculateSum = new ArrayList<>();
//
//    public static ArrayList<Double> calculateAverage = new ArrayList<>();
//    public static ArrayList<Integer> passesNumber = new ArrayList<>();
//    public static ArrayList<Integer> failureNumber = new ArrayList<>();
//
//    public static void calculateSubject(int[][] value){
//
//
//        for(int column = 0; column < value[0].length; column++) {
//            int count = 0;
//            int total = 0;
//            double average = 0;
//            int passes = 0;
//            int fail = 0;
//
//            int[] new_list = new int[value.length];
//            for (int temp = 0; temp < value.length; temp++) {
//
//                new_list[count] = value[temp][column];
//                total += new_list[count];
//                average = (double) total / value.length;
//
//                if (new_list[count] > 50){
//                    ++passes;
//
//                }
//                if (new_list[count] < 50){
//                    ++fail;
//                }
//                count++;
//            }
//
//            passesNumber.add(passes);
//            failureNumber.add(fail);
//            calculateSum.add(total);
//            calculateAverage.add(average);
//            int max = new_list[0];
//            for (int num : new_list){
//                if(num > max){
//                    max = num;
//                }
//            }
//            maxSubject.add(String.valueOf(max));
//
//            int min = new_list[0];
//            for (int num : new_list){
//                if(num < min){
//                    min = num;
//                }
//            }
//            minSubject.add(String.valueOf(min));
//
//        }
//
//
//        System.out.println("SUBJECT SUMMARY");
//        for (int count = 0; count < maxSubject.size(); count++){
////        System.out.print("The highest is" + maxSubject.get(count) + "\n" + "The lowest is" + minSubject.get(count));
//
//            if (Integer.parseInt(maxSubject.get(count)) > Integer.parseInt(minSubject.get(count))){
//                System.out.printf("""
//                SUBJECT %d
//                Highest scoring student is: %s
//                Lowest scoring student is: %s
//                Total Score is: %d
//                Average Score is: %.2f
//                Number of passes: %d
//                Number of failure: %d%n
//                """,count+1,maxSubject.get(count),minSubject.get(count),calculateSum.get(count),calculateAverage.get(count),passesNumber.get(count),failureNumber.get(count));
//            }
//
//            else {
//                System.out.printf("""
//                SUBJECT %d
//                Highest scoring student is: %s
//                Total Score is: %d
//                Average Score is: %.2f
//                Number of passes: %d
//                Number of failure: %d%n
//                """,count+1,maxSubject.get(count),calculateSum.get(count),calculateAverage.get(count),passesNumber.get(count),failureNumber.get(count));
//            }
//        }
