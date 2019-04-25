import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class ObjectStore {
    public static void main(String[] args) {
        /*1)создать generic класс AnyObjectStore1 <T> (внутри значения хранить в одной из имплементаций Set)
        реализовать методы добавления объекта типа T
        рализовать метод удаления объекта типа T
        реализовать в этом классе метод contains с параметром типа T*/

        CarriageStore<String, Integer> car = new CarriageStore<>();
        car.addToSetCarriage("Nissan");
        car.addToSetCarriage("Toyota");

        CarriageStore<String, Integer> myCar = new CarriageStore<>();
        myCar.addToOurCarriage(1);
        myCar.addToOurCarriage(2);

        System.out.println(car.containceCarriage("Niva"));

        /*2)создать не generic класс AnyObjectStore2
        a) реализовать статический generic метод добавления объекта в лист
        параметры:
        List в который нужно добавить элемент
        Элемент который нужно добавить в лист
        результат: void*/

        List<Integer> documents = new ArrayList<>();
        ArchiveOfDocuments.addDoc(documents, 122);
        ArchiveOfDocuments.addDoc(documents, 155);
        ArchiveOfDocuments.addDoc(documents, 13);
        ArchiveOfDocuments.showListDoc(documents);

       /*b) рализовать статический generic метод удаления объекта из List
        параметры:
        List из которого надо удалить елемент
        Элемент который нужно удалить
        результат: вернуть удаленны объект или null если такого объекта нет в листе*/


        ArchiveOfDocuments.removeDoc(documents, 155);
        ArchiveOfDocuments.showListDoc(documents);


        List<Object> bookLab = new ArrayList<>();
        //BookStore.showListBooks(bookLab, new Book);*/

        /*c) реализовать в этом классе статический generic метод contains
         параметры:
         List в котором надо проверить наличие элемена
         Элемент наличие которого нужно проверить
         : TRUE/FALSE*/

        //ArchiveOfDocuments.containsDoc(documents, 12);

        /*3)создайте класс ArrayAndListUtils
        a) реализовать в нем статический generic метод для смены местами элементов N и M
        параметры метода:
        исходный массив
        индекс элемента N
        интекс элемента M
        результат:
        массив где элемент N и M поменяны местами*/

        String[] myArray = {"1.2", "1.3", "2.5", "6.7"};
        System.out.println(Arrays.asList(ArrayAndListUtils.swapItems(myArray, 0, 2)));

        /*b) реализовать статический generic метод для поиска в List максимального елемента начиная с позиции N и заканчивая позицией M
        !!! сделать чтобы generic тип реализовывал Comparable
        параметры метода:
        исходный лист
        индекс элемента N
        интекс элемента M
        результат:
        максимальный объект*/

    }
}
