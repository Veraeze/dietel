package array;

import function.Function;

public class TaskThree {
    public static void main(String[] args) {
        char[][] load = new char[3][3];
        for (int firstCount = 0; firstCount < load.length; firstCount++) {
            for (int secondCount = 0; secondCount < load[firstCount].length; secondCount++) {
                for (int thirdCount = 0; thirdCount < secondCount; thirdCount += 2) System.out.print(" , ");
                if ((firstCount == 0 && secondCount == 1) || (firstCount == 1 && secondCount == 2) || (firstCount == 2 && secondCount == 0))
                    System.out.print('O');
                else System.out.print('X');
            }
            System.out.println();
        }

    }

}



