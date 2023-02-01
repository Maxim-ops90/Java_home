import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;
public class Task2 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
      
        Random rnd = new Random();
        for (int i = 0; i < 20; i++) {
            list1.add(rnd.nextInt(100));
            list2.add(rnd.nextInt(100));
        }
        System.out.println(list1); // Вывод первого списка
        System.out.println(list2); // Вывод второго списка
        list1.removeAll(list2); // Отобрать список
        System.out.println(list1); // Напечатать отобранный список
        Collections.sort(list1); //Сортировка спискка
        Collections.reverse(list1);// Упорядочить по убыванию
        System.out.println(list1);  // Вывод отобранного упорядоченого списка
    }
}