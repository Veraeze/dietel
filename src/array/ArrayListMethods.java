package array;
import java.util.Arrays;
import java.util.Objects;

public class ArrayListMethods <Vee>{

    private Object[] objects = new Object[15];

    public int size(){
        int count = 0;
        for (Object value : objects) {
            if (value != null) count++;
        }
        return count;
    }

    public int add(Vee input){

        if (size() == objects.length){
            Object[] newObjects = new Object[objects.length*2];

            for (int index = 0; index < objects.length; index++) {
                newObjects[index] = objects[index];
            }
            objects = newObjects;
        }
        objects[size()] =  input;
        return size();
    }


    public  boolean isEmpty() {
        boolean result;
        if (size() == 0) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }



        public void addAll(ArrayListMethods<Vee> value){

            for (int index = 0; index < value.size(); index++) {
                objects[size()] = value.get(index);
            }
        }


        public int remove(Vee value) {

            for (int index = 0; index < size(); index++) {
                if (Objects.equals(objects[index], value)) {
                    objects = removeIndex(objects, index);
                    break;
                }
            }
            return size();
        }

        public int remove(int index) {
            objects = removeIndex(objects, index);
            return size();
        }

        public Object[] removeIndex(Object[] initialArray, int indexToRemove) {
            Object[] newContainer = new Object[initialArray.length - 1];
            for(int temp = 0; temp < newContainer.length; temp++) {
                newContainer[temp] = initialArray[temp >= indexToRemove ? temp + 1 : temp];
            }
            return newContainer;
        }

        public Vee get(int index){
            if (index >= size()) throw new ArrayIndexOutOfBoundsException("Index " + index + " out of bounds.");
            return (Vee) objects[index];
        }

        public int indexOf(Vee value){

            for (int index = 0; index < size(); index++) {
                if (Objects.equals(objects[index], value)) return index;
            }
            return -1;
        }

        public int  lastIndexOf(Vee value){
            for (int index = size() - 1; index >= 0; index--){
                if (Objects.equals(objects[index], value))return index;
            }
            return -1;
        }

        public boolean contains(Vee values){
            for (int value = 0; value < size(); value++){
                if (Objects.equals(objects[value], values)) return true;
            }
            return false;
        }

        public void clear(){
            Arrays.fill(objects, null);
        }

        public Object[] toArray(){
            Object[] newArray = new Object[size()];

            for (int index = 0; index < size(); index++){
                newArray[index] = objects[index];
            }
            return newArray;
        }

        public boolean containsAll(ArrayListMethods<Vee> value){
            for (int index = 0; index < value.size(); index++) {
                if (objects[index] == value.get(index)) return true;
            }
            return false;
        }

        public static void main(String[] args) {

            ArrayListMethods<String> arrayList = new ArrayListMethods<>();

            arrayList.add("goat5");
            arrayList.add("goat4");
            arrayList.add("goat3");
            arrayList.add("goat5");
            arrayList.add("goat1");
            arrayList.add("goat5");



            ArrayListMethods<String> arrayList1 = new ArrayListMethods<>();
            arrayList1.add("Lion1");
            arrayList1.add("Lion2");

            arrayList.addAll(arrayList1);

            for (int i = 0; i < arrayList.size(); i++) {
                System.out.println(arrayList.get(i));
            }

            System.out.println(arrayList.containsAll(arrayList1));

            System.out.println(Arrays.toString(arrayList.toArray()));

        }




    }
