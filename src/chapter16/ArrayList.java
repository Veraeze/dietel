package chapter16;

public class ArrayList {
    private Object[] elements;

    public ArrayList(){
        elements = new Object[8];
    }

    public Object add(Object element){
        for (int index = 0; index < elements.length; index++) {
            if (elements[index] != null) elements[index] = element;
        }
        return element;
    }
}