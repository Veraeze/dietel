package array;

import function.Function;

public class TaskFour   {
    public static void main(String[] args) {
        char[] name = {'A', 'M', 'C', 'W', 'I', 'T'};
        int n = name.length;
        String shuffle = Function.shuffle(name, n);
        System.out.println(shuffle);
    }

}
