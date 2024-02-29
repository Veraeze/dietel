package streams;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Random;
import java.util.stream.Stream;

import static java.lang.System.out;

public class GenerateStreamSample {
    public static void main(String[] args) {
        Stream.generate(()-> new Random().nextInt(1, 100))
                .limit(5)
                .forEach(out::println);

    }

//    private static void  displayNumber(int number){
//        try{
//           var writer =  new BufferedWriter(new OutputStreamWriter(out));
//           writer.write(number);
//           writer.flush();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//   }
}
