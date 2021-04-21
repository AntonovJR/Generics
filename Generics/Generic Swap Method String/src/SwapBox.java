import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SwapBox<T> {
    private List<T> values;

    public SwapBox() {
        this.values = new ArrayList<>();
    }

    public void add(T element) {
        this.values.add(element);

    }

    public void print() {
              for (T value : values) {
            System.out.println(value.getClass().getName()+": "+value);

        }
    }

    public void swap(int firstIndex, int secondIndex) {
        Collections.swap(values, firstIndex, secondIndex);

    }
}
