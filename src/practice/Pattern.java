package practice;

public class Pattern {
    public static void main(String[] args) {
        for (int rows = 1; rows <= 5; rows++) {

            for (int column = 1; column <= rows - 1; column++) {

                System.out.print("* ");

            }
            System.out.println(" ");
        }
        for (int rows = 1; rows <= 5; rows++) {
            for (int line = 5; line >= rows ; line--) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
