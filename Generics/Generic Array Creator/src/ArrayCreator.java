import java.lang.reflect.Array;
import java.util.Objects;

public class ArrayCreator {


    public static <T> T[] create(int length, T item) {
        T[] array = (T[]) new Objects[length];
        for (int i = 0; i < array.length ; i++) {
            array[i] = item;

        }
        return array;
    }

    public static <T> T[] create(Class<T> clazz, int length, T item) {
        T[] array = (T[]) Array.newInstance(clazz, length);
        for (int i = 0; i < array.length; i++) {
            array[i] = item;
        }
        return array;

    }


}
