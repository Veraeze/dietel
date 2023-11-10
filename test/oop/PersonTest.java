package oop;

import oop.problems.Person;
import oop.problems.Problem;
import org.junit.jupiter.api.Test;
import static oop.problems.Type.*;
import static org.junit.jupiter.api.Assertions.*;
class PersonTest {

    @Test
    void testAddOneProblem() {
        Problem firstProblem = new Problem("dog food", FINANCIAL);
        Person.addProblem(firstProblem);
        assertEquals(1, Person.tellProblems().size());
    }

    @Test
    void testAddMultipleProblems() {
        Problem firstProblem = new Problem("fuel", FINANCIAL);
        Person.addProblem(firstProblem);
        assertEquals(1, Person.tellProblems().size());

        Problem secondProblem = new Problem("sleeping in class", EDUCATION);
        Person.addProblem(secondProblem);
        assertEquals(2, Person.tellProblems().size());

        Problem thirdProblem = new Problem("praying", SPIRITUAL);
        Person.addProblem(thirdProblem);
        assertEquals(3, Person.tellProblems().size());
    }

    @Test
    void testSolveOneProblems() {
        Problem firstProblem = new Problem("fuel", FINANCIAL);
        Person.addProblem(firstProblem);
        assertEquals(1, Person.tellProblems().size());

        Problem secondProblem = new Problem("sleeping in class", EDUCATION);
        Person.addProblem(secondProblem);
        assertEquals(2, Person.tellProblems().size());

        Problem thirdProblem = new Problem("praying", SPIRITUAL);
        Person.addProblem(thirdProblem);
        assertEquals(3, Person.tellProblems().size());

        Person.solveProblem(secondProblem);
        assertEquals(2, Person.tellProblems().size());

    }

    @Test
    void testSolveMultipleProblems() {
        Problem firstProblem = new Problem("fuel", FINANCIAL);
        Person.addProblem(firstProblem);
        assertEquals(1, Person.tellProblems().size());

        Problem secondProblem = new Problem("sleeping in class", EDUCATION);
        Person.addProblem(secondProblem);
        assertEquals(2, Person.tellProblems().size());

        Problem thirdProblem = new Problem("praying", SPIRITUAL);
        Person.addProblem(thirdProblem);
        assertEquals(3, Person.tellProblems().size());

        Person.solveProblem(secondProblem);
        Person.solveProblem(thirdProblem);
        assertEquals(1, Person.tellProblems().size());

    }
}