package leetcode;

import org.junit.Test;

import static leetcode.MergeStrings.merge;
import static org.junit.jupiter.api.Assertions.*;

public class MergeStringsTest {
@Test
public void merge1(){
    String word1 = "abc";
    String word2 = "pqr";
    String output = "apbqcr";
    assertEquals(output, merge(word1, word2));
}

@Test
    public void merge2(){
    String word1 = "ab";
    String word2 = "pqrs";
    String output = "apbqrs";
    assertEquals(output, merge(word1, word2));
}

    @Test
    public void merge3(){
        String word1 = "abcd";
        String word2 = "pq";
        String output = "apbqcd";
        assertEquals(output, merge(word1, word2));
    }
}