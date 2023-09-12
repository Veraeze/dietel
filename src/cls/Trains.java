package cls;

public class Trains {
    public static void main(String[] args) {
        for (int rows = 1; rows <= 6; rows++) {
            for (int line = 5; line >= rows - 1; line--) {
                System.out.print("* ");
            }
            for (int column = 0; column <= rows - 1; column++) {
                System.out.print("  ");
            }
            for (int column = 0; column <= rows-1; column++) {
                System.out.print("* ");
            }
            for (int line = 5; line >= rows - 1; line--) {
                System.out.print("  ");
            }
            for (int column = 5; column >= rows - 1; column--) {
                System.out.print("* ");
            }

            System.out.println(" ");

        }
    }
}
