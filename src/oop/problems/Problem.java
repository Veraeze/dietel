package oop.problems;

public class Problem {
    private String name;
    private Type type;
    private static boolean isSolved;

    public  boolean isSolved() {
        return isSolved;
    }

    public void setIsSolved(boolean isSolved) {
        Problem.isSolved = isSolved;
    }

    public Problem(String name, Type type){
        this.name = name;
        this.type = type;
        this.setIsSolved(false);
    }
    public String getName(){
    return name;
    }

    public Type getType() {
        return type;
    }

    @Override
    public String toString(){
        return String.format("%-15s%-10.2s", name,type);
    }
}
