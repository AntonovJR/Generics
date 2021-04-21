import java.util.ArrayList;
import java.util.List;

public class BoxCompareDouble<T> {
    private List<T> values;

    public BoxCompareDouble() {
        this.values = new ArrayList<>();
    }
    public void add(T element) {
        this.values.add(element);

    }



    public <T extends Comparable<T>> void print(T input) {
        int n = 0;
        for (int i = 0; i < values.size(); i++) {
            if (input.compareTo((T) values.get(i))<0) {
                n++;
            }

        }
        System.out.println(n);
    }
}
