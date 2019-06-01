import java.util.List;

public class ArrayAndListUtils {

    public static <T> T[] swapItems(T[] array, int n, int m) {
        T tmp = array[n];
        array[n] = array[m];
        array[m] = tmp;
        return array;
    }

    /*public static <T extends Comparable> T maxElement(List<T> list, int n, int m) {
        T max = list.get(n);
        for (int i = n; i < m; i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        return max;
    }*/
}