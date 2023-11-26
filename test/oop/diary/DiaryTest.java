package oop.diary;

import oop.diary.exceptions.CannotBeFound;
import oop.diary.exceptions.LockedDiary;
import oop.diary.exceptions.WrongPassword;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DiaryTest {
    Diary diary;

    @BeforeEach
    void setDiary() {
        diary = new Diary("username", "password");
    }

    @Test
    public void diaryIsLocked_testThatDiaryCanBeUnlockedByPassword() {
        assertTrue(diary.isLocked());

        diary.unlockDiary("password");
        assertFalse(diary.isLocked());
    }

    @Test
    public void diaryIsLocked_throwsExceptionWhenUnlockedWithWrongPassword() {
        assertThrows(WrongPassword.class, () -> diary.unlockDiary("maybe"));
    }

    @Test
    public void diaryIsUnlocked_testThatDiaryCanBeLocked() {
        diary.unlockDiary("password");
        assertFalse(diary.isLocked());

        diary.lockDiary();
        assertTrue(diary.isLocked());
    }

    @Test
    public void testThatDiaryCanCreateEntry() {
        diary.unlockDiary("password");
        assertFalse(diary.isLocked());

        diary.createEntry("Title", "Body");
        assertEquals(1, diary.getNumberOfEntries());
        assertEquals(221, diary.generateID());

        diary.lockDiary();
        assertTrue(diary.isLocked());
    }

    @Test
    public void testThatDiaryCanCreateMoreThanOneEntry() {
        diary.unlockDiary("password");
        assertFalse(diary.isLocked());

        diary.createEntry("Title", "Body");
        assertEquals(1, diary.getNumberOfEntries());
        assertEquals(221, diary.generateID());

        diary.createEntry("Title", "Body");
        assertEquals(2, diary.getNumberOfEntries());
        assertEquals(222, diary.generateID());

        diary.lockDiary();
        assertTrue(diary.isLocked());
    }

    @Test
    public void diaryIsLocked_ThrowExceptionWhenTryingToCreateEntry(){
        diary.lockDiary();
        assertTrue(diary.isLocked());

        assertThrows(LockedDiary.class, ()-> diary.createEntry("title", "body"));
    }

    @Test
    public void testThatDiaryCanDeleteEntry() {
        diary.unlockDiary("password");
        assertFalse(diary.isLocked());

        diary.createEntry("Title", "Body");
        assertEquals(1, diary.getNumberOfEntries());
        assertEquals(221, diary.generateID());

        diary.deleteEntry(221);
        assertEquals(0, diary.getNumberOfEntries());

        diary.lockDiary();
        assertTrue(diary.isLocked());
    }

    @Test
    public void testThatDiaryCanDeleteMoreThanOneEntry() {
        diary.unlockDiary("password");
        assertFalse(diary.isLocked());

        diary.createEntry("Title1", "Body1");
        assertEquals(221, diary.generateID());

        diary.createEntry("Title2", "Body2");
        assertEquals(222, diary.generateID());

        diary.createEntry("Title3", "Body3");
        assertEquals(223, diary.generateID());

        assertEquals(3, diary.getNumberOfEntries());

        diary.deleteEntry(221);
        diary.deleteEntry(223);

        assertEquals(1, diary.getNumberOfEntries());

        diary.lockDiary();
        assertTrue(diary.isLocked());
    }

    @Test
    public void diaryIsLocked_ThrowExceptionWhenTryingToDeleteEntry(){
        diary.lockDiary();
        assertTrue(diary.isLocked());

        assertThrows(LockedDiary.class, ()-> diary.deleteEntry(222));
    }

    @Test
    public void testThatAnExceptionIsThrownWhenTryingToDeleteADeletedEntry() {
        diary.unlockDiary("password");
        assertFalse(diary.isLocked());

        diary.createEntry("Title", "Body");
        assertEquals(1, diary.getNumberOfEntries());
        assertEquals(221, diary.generateID());

        diary.deleteEntry(221);
        assertEquals(0, diary.getNumberOfEntries());

        assertThrows(CannotBeFound.class, () -> diary.deleteEntry(221));

        diary.lockDiary();
        assertTrue(diary.isLocked());
    }

    @Test
    public void testThatDiaryCanFindEntry() {
        diary.unlockDiary("password");
        assertFalse(diary.isLocked());

        diary.createEntry("Title1", "Body1");
        assertEquals(221, diary.generateID());

        diary.createEntry("Title2", "Body2");
        assertEquals(222, diary.generateID());

        assertEquals(2, diary.getNumberOfEntries());

        Entry entry2 = diary.findEntry(222);
        Entry entry1 = diary.findEntry(221);
        assertEquals(222, entry2.getIDNumber());
        assertEquals(221, entry1.getIDNumber());

        diary.lockDiary();
        assertTrue(diary.isLocked());
    }

    @Test
    public void testThatAnExceptionIsThrownWhenTryingToFindAnEntryThatDoesNotExist() {
        diary.unlockDiary("password");
        assertFalse(diary.isLocked());

        diary.createEntry("Title1", "Body1");
        assertEquals(221, diary.generateID());

        assertThrows(CannotBeFound.class, () -> diary.findEntry(123));

        diary.lockDiary();
        assertTrue(diary.isLocked());
    }

    @Test
    public void testThatDiaryCanUpdatePreviousEntry() {
        diary.unlockDiary("password");
        assertFalse(diary.isLocked());

        diary.createEntry("Title1", "Body1");
        assertEquals(221, diary.generateID());

        diary.createEntry("Title2", "Body2");
        assertEquals(222, diary.generateID());

        assertEquals(2, diary.getNumberOfEntries());

        diary.updateEntry(221,"Title1","Body1");
        assertEquals(2,diary.getNumberOfEntries());
        assertEquals(0, diary.findIndexOf(221));

        diary.updateEntry(222,"Title2","Body2");
        assertEquals(2,diary.getNumberOfEntries());
        assertEquals(1, diary.findIndexOf(222));
    }

    @Test
    public void diaryIsLocked_ThrowExceptionWhenTryingToUpdateEntry(){
        diary.lockDiary();
        assertTrue(diary.isLocked());

        assertThrows(LockedDiary.class, ()-> diary.deleteEntry(222));
    }

}
