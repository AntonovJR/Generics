import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SmartArray<T> extends Object {

    private List<T> elements;
    private int size;

    public SmartArray() {
        this.elements = new ArrayList<>();
        this.size = 0;
    }

    public void add(T token) {
        elements.add(token);
    }

    public void remove(int index) {
        elements.remove(index);
    }

    public boolean contains(T token) {
        for (T element : elements) {
            if(element.equals(token)){
                return true;
            }
        }
        return false;
    }

    public void swap(int firstIndex, int secondIndex) {
        Collections.swap(elements, firstIndex, secondIndex);

    }
    public <T extends Comparable<T>> void greater(T input) {
        int n = 0;
        for (int i = 0; i < elements.size(); i++) {
            if (input.compareTo((T) elements.get(i))<0){
                n++;
            }
        }
        System.out.println(n);
    }
    public void print() {
        for (T element : elements) {
            System.out.println(element);

        }
    }
    public <T extends Comparable<T>> T getMax() {

        if (elements.size() == 0) throw new IllegalArgumentException();

        T max = (T) elements.get(0);

        for (int i = 1; i < elements.size(); i++) {

            if (max.compareTo((T) elements.get(i)) < 0)

                max = (T) elements.get(i);

        }

        return max;

    }
    public  <T extends Comparable<T>> T getMin() {

        if (elements.size() == 0) throw new IllegalArgumentException();

        T min = (T) elements.get(0);

        for (int i = 1; i < elements.size(); i++) {

            if (min.compareTo((T) elements.get(i)) > 0)

                min = (T) elements.get(i);

        }

        return min;

    }

    public void sort() {
        Collections.sort(elements, Comparator.comparing(Object::toString));
    }
}