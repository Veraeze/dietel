package oop.problems;

public class Problem {
    private final String name;
    private final Type type;
    private static boolean isSolved;

    public Problem(String name, Type type){
        this.name = name;
        this.type = type;
        this.setIsSolved(false);
    }

    public void setIsSolved(boolean isSolved) {
        Problem.isSolved = isSolved;
    }

    public String getName(){
        return name;
    }

    public Type getType() {
        return type;
    }

    public  boolean isSolved() {
        return isSolved;
    }

    @Override
    public String toString(){
        return String.format("%-15s%-10.2s", name,type);
    }
}
