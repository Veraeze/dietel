package oop.problems;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private static final List<Problem> problems = new ArrayList<>();


    public static List<Problem> addProblem(Problem problem) {
        problems.add(problem);
        return problems;
    }

    public static List<Problem> solveProblem(Problem problem) {
        problem.setIsSolved(true);
        problems.remove(problem);
        return problems;
    }


    public static List<Problem> tellProblems() {
        return problems;
    }

}