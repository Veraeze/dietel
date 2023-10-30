package array;

public class NoOfDigits {
        public static int noOfDigits(String[] array) {
            int loop = 0;
            for (String index : array) {
                for (int count = 0; count < index.length(); count++) {
                    char save = index.charAt(count);
                    if ((save) >= 48 && (save) <= 57) {
                        loop += 1;
                    }
                }
            }
            return loop;
        }












    public static void main(String[] args) {

        String[] names ={"alfred12", "vera33"};
        int loop = 0;
        for (int examine = 0; examine < names.length; examine++) {
        String index = names[examine];
            System.out.println("index: " + index);
        for (int count = 0; count < index.length(); count++) {
            char save = index.charAt(count);
            System.out.println("char: " + save);
            if ((save) >= 48 && (save) <= 57) {
                loop += 1;
            }
        }
    }
        System.out.println(loop);}
}
