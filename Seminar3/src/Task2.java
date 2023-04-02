import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Task2 {
    public void randomNumberList(){
        ArrayList<Double> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(Math.random());
        }
        System.out.println(numbers);
        //для работы с коллекциями
        Collections.sort(numbers);
        System.out.println(numbers);

    }
}
//    Заполнить список десятью случайными числами.
//        Отсортировать список методом sort() и вывести его на экран.