package cls;

public class InfinityLoop {
    public static void main(String[] args) {
        int number = 50;
        int vera = 1;
        for(;;) {
            if(number  == 5) break;
            System.out.println(vera + ". Infinity loop ");
                    number--;
                    vera++;
        }
    }
}
