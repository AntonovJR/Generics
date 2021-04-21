import java.util.ArrayList;
import java.util.List;

public class Box<T> {
    private List<T> values;

    public Box() {
        this.values = new ArrayList<>();
    }

    public void add(T element) {
        this.values.add(element);

    }

    public void print() {
        StringBuilder sb = new StringBuilder();
        for (T value : values) {
            System.out.println(value.getClass().getName()+": "+value);

        }
    }

}
