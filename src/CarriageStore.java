import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class CarriageStore<T, T2> {
    private Set<T> setCarriage = new HashSet<>();
    private Set<T2> ourCarriage = new LinkedHashSet<>();

    public void addToSetCarriage(T value) {
        setCarriage.add(value);
    }

    public void addToOurCarriage(T2 element) {
        ourCarriage.add(element);
    }

    public void removeCarriage(T element) {
        setCarriage.remove(element);

    }

    public static <T> void showCarriage(Set<T> set){
        Iterator<T> iterator = set.iterator();
        while(iterator.hasNext()){
            T val = iterator.next();
            System.out.println(val);
        }
    }

    public boolean containceCarriage(T element) {
        System.out.println("This element is in the list (true/false)");
        if (setCarriage.contains(element) == true) {
            return true;
        } else {
            return false;
        }
    }
}
