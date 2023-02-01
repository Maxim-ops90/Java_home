import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
public class Task4 {
//    1. Создать словарь HashMap. Обобщение <Integer, String>.
//    2. Заполнить пятью ключами (индекс, ФИО+Возраст+Пол "Иванов Иван Иванович 28 м"), добавить ключь, если не было!)
public static void main(String[] args) throws Exception {
    Map<Integer, String> hashMap = new HashMap<>();
    hashMap.putIfAbsent(1, "Иванов Иван Иванович 28 м ");
    hashMap.putIfAbsent(2, "Петрова Екатерина Петровна 13 ж");
    hashMap.putIfAbsent(3, "Смирнов Константин игоревич 20 м");
    hashMap.putIfAbsent(4, "Суркова Анна Владимировна 30 ж");
    hashMap.putIfAbsent(5, "Сидоров Артем Сергеевич 22 м");

    for (Map.Entry<Integer, String> iterable_element : hashMap.entrySet()) {
        System.out.println(iterable_element.getKey()+" "+ iterable_element.getValue());
    } 

    ArrayList<Integer> age = new ArrayList<>();
    ArrayList<String> family = new ArrayList<>();
    ArrayList<String> name = new ArrayList<>();
    ArrayList<String> soname = new ArrayList<>();
    LinkedList<Integer> index = new LinkedList<>();

    System.out.println("\n 3.Изменить значения сделав пол большой буквой.");
    Set<Integer> keySet = hashMap.keySet();
    for (int i = 0; i < keySet.size(); i++) {
        String [] string = (hashMap.get(keySet.toArray()[i]).split("\n"));   
        for (int j = 0; j < string.length; j++) {
            String [] tmp = string[j].split(" ");
            System.out.println(tmp[0]+ " " + tmp[1] + " "+ tmp[2] +" "+ tmp[3]+" "+tmp[4].toUpperCase());
        } 
    }

    for (int i = 0; i < keySet.size(); i++) {
        String [] string = (hashMap.get(keySet.toArray()[i]).split("\n"));   
        for (int j = 0; j < string.length; j++) {
            String [] tmp = string[j].split(" ");
            index.add(i);
            age.add(Integer.valueOf(tmp[3]));
            family.add(tmp[0]+" ");
            name.add(tmp[1].charAt(0) + ".");
            soname.add(tmp[2].charAt(0) + ".");
        } 
    }

    ArrayList<Integer> tmp = new ArrayList<>(age);
    Collections.sort(tmp);
    for (int i = 0; i < tmp.size(); i++) {
        int j = age.indexOf(tmp.get(i));
        index.set(i, j);
    }
    System.out.println("\n*5.Сортировать значения по возрасту и вывести отсортированную коллекция как в четвёртом пункте ");
    for (int i = 0; i < index.size(); i++) {
        System.out.printf(family.get(index.get(i)));
        System.out.printf(name.get(index.get(i)));
        System.out.printf(soname.get(index.get(i)));
        System.out.println(" "+age.get(index.get(i)));
      }
}
}
