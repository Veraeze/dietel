package oop.diary;

import oop.diary.exceptions.DiaryDoesNotExist;
import oop.diary.exceptions.UsernameNotFound;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DiariesTest {
    Diaries diaries;

    @BeforeEach
    void setDiaries() {
        diaries = new Diaries();
    }

    @Test
    public void testThatDiariesCanAddDiary() {
        assertEquals(0, diaries.numberOfDiary());

        diaries.add("username", "password");
        assertEquals(1, diaries.numberOfDiary());
    }

    @Test
    public void testThatDiariesCanAddMoreThanOneDiary() {
        diaries.add("username", "password");
        assertEquals(1, diaries.numberOfDiary());

        diaries.add("username", "password");
        assertEquals(2, diaries.numberOfDiary());
    }

    @Test
    public void testThatDiariesCanFindDiaryByUsername() {
        diaries.add("cynthia", "password");
        diaries.add("esther", "password2");
        diaries.add("ann", "password2");

        assertEquals(3, diaries.numberOfDiary());

        Diary diary1 = diaries.findDiary("cynthia");
        assertEquals("cynthia", diary1.getUsername());

        Diary diary2 = diaries.findDiary("ann");
        assertEquals("ann", diary2.getUsername());

        Diary diary3 = diaries.findDiary("esther");
        assertEquals("esther", diary3.getUsername());
    }

    @Test
    public void testThatExceptionIsThrown_FindDiaryByUsernameThatDoesNotExist() {
        diaries.add("cynthia", "password");
        diaries.add("esther", "password2");

        assertEquals(2, diaries.numberOfDiary());

        assertThrows(UsernameNotFound.class, () -> diaries.findDiary("david"));
    }

    @Test
    public void testThatDiariesCanDeleteDiary(){
        diaries.add("cynthia", "password");
        diaries.add("esther", "password2");
        diaries.add("ann", "password3");

        assertEquals(3, diaries.numberOfDiary());

        diaries.delete("esther", "password2");
        assertEquals(2, diaries.numberOfDiary());
    }

    @Test
    public void testThatExceptionIsThrown_DeleteDiaryByUsernameThatDoesNotExist() {
        diaries.add("cynthia", "password");
        diaries.add("esther", "password2");

        assertEquals(2, diaries.numberOfDiary());

        assertThrows(DiaryDoesNotExist.class, () -> diaries.delete("david", "password"));
    }
}
