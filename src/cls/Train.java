package cls;

public class Train {
    public static void main(String[] args) {
        for (int rows = 1; rows <= 6; rows++) {
            for (int line = 5; line >= rows - 1; line--) {
                System.out.print("  ");
            }
            for (int column = 1; column <= rows - 1; column++) {
                System.out.print("* ");
            }
            for (int column = 1; column <= rows; column++) {
                System.out.print("* ");
            }

            System.out.println(" ");

        }
        for (int rows = 1; rows <= 6; rows++) {
            for (int column = 1; column <= rows; column++) {
                System.out.print("* ");
            }
            for (int line = 5; line >= rows - 1; line--) {
                System.out.print("  ");
            }
            for (int column = 1; column <= rows - 1; column++) {
                System.out.print("* ");
            }


            System.out.println(" ");

        }
    }
}
