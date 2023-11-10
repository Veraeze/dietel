package array;

import function.TaskWed;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskWedTest {


        @Test
        void removeDuplicate() {
            int[] numbers = {1, 2, 3, 3, 2, 4, 5, 6};
            int[] output = {2, 3};
            assertArrayEquals(output, TaskWed.remove(numbers));
        }

        @Test
        void palindrome() {
            assertTrue(TaskWed.palindrome("Dad"));
        }

        @Test
        void palindrome2() {
            assertTrue(TaskWed.palindrome("Anna"));
        }

        @Test
        void palindrome3() {
            assertFalse(TaskWed.palindrome("Grace"));
        }

        @Test
        void reverseString() {
            String output = "ew edistuo ";
            String input = "we outside";
            assertEquals(output,TaskWed.reverseStrings(input));
        }

    @Test
    void dominant() {
            int[] input = {9, 3, 10, 7, 4};
            int[] output = {10, 7, 4};
        assertArrayEquals(output, TaskWed.dominant(input));
    }

    @Test
    void palindromeInteger2() {
        assertTrue(TaskWed.isPalindrome("1231"));
    }

    @Test
    void palindromeInteger3() {
        assertFalse(TaskWed.isPalindrome("nina"));
    }

    @Test
    void palindromeInteger4() {
        assertTrue(TaskWed.indices(13579, 4, 1, 2));
    }

    @Test
    void palindromeInteger5() {
        assertFalse(TaskWed.indices(-13579, 4, 1, 3));
    }
}