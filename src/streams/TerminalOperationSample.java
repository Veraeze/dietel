package streams;

import java.util.List;

public class TerminalOperationSample {
    public static void main(String[] args) {
        var result = List.of(10, 20, 30, 40)
                .stream()
                .map(String::valueOf)//map is a transformation operation
                .reduce(String::concat).orElseThrow();//reduce takes in the entire elements of the stream and produces one value
//or else throw extracts the elements from the optional object, if theres no element it throws a no such element exception
        System.out.println(result);
    }
}
