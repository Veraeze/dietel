package cls;

public class Trian {
    public static void main(String[] args) {
        for (int rows = 1; rows <= 5; rows++) {

            for (int column = 1; column <= rows - 1; column++) {

                System.out.print("# ");

            }
            for (int line = 4; line >= rows - 1; line--) {

                System.out.print("* ");

            }

            System.out.println(" ");

        }
    }
}
