import java.util.Iterator;
import java.util.List;

public class ArchiveOfDocuments {

    public static <T extends Number> void addDoc(List<T> list, T document) {

        list.add(document);
    }

    public static <T extends Number> boolean removeDoc(List<T> list, T document) {
        if (list.contains(document)) {
            list.remove(document);
            return true;
        }
        if (!(list.contains(document))) {
        }
        return false;
    }

    /*static <T extends Number> boolean containsDoc(List<T> list, T document) {
        System.out.println("This element is in the list (true/false)");
        if ((list.contains(document) = true)) {
            return true;
        } else {
            return false;
        }
    }*/

    static <T> void showListDoc(List<T> list) {
        Iterator<T> iterator = list.iterator();
        while (iterator.hasNext()) {
            T elm = iterator.next();
            System.out.println(elm);
        }

    }
}