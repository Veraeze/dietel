package array;

public class Trial6 {

    public static void main(String[] args) {
        int solution = occur(new int[]{2, 1,1,1, 1, 2, 2});
        System.out.println(solution);
    }
    public  static int occur(int[] numbers) {
        int result = 0;
        int count = 0;
        int maximum = 0;
        int n = 0;

        for (int j : numbers) {
            int save = 0;
            for (int number : numbers) {
                if (j == number) {
                    count++;
                }
            }
            save = count;
            for (int check = 0; check < numbers.length; check++) {
                if (maximum < save) {
                    maximum = save;
                    n = j;
                }
            }
            count = 0;
        }
        return n;
    }

}


