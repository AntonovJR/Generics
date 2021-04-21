import java.util.ArrayList;
import java.util.List;

public class IntegerBox<T> {
    private List<T> values;

    public IntegerBox() {
        this.values = new ArrayList<>();
    }

    public void add(T element) {
        this.values.add(element);

    }

    public void print() {
        StringBuilder sb = new StringBuilder();
        for (T value : values) {
            sb.append(value.getClass().getName()).append(": ").append(value);
            sb.append(System.lineSeparator());

        }
        System.out.println(sb);
    }

}
