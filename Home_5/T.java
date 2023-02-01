// Создать словарь HashMap. Обобщение <Integer, String>.
// Заполнить пятью ключами (индекс, ФИО+Возраст+Пол "Иванов Иван Иванович 28 м"), добавить ключь, если не было!)
// Изменить значения сделав пол большой буквой.
import java.util.HashMap;
import java.util.Set;

public class Task123 {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.putIfAbsent(1, "Иванов Иван Иванович 28 м ");
        hashMap.putIfAbsent(2, "Петрова Екатерина Петровна 13 ж");
        hashMap.putIfAbsent(3, "Смирнов Константин игоревич 20 м");
        hashMap.putIfAbsent(4, "Суркова Анна Владимировна 30 ж");
        hashMap.putIfAbsent(5, "Сидоров Артем Сергеевич 22 м");
        // System.out.println(hashMap.toString());

        Set<Integer> keySet = hashMap.keySet();
        // String sValues= hashMap.values();

        for (Integer i: keySet) {
            String sValues = hashMap.get(keySet.toArray()[i - 1]);
            String[] newA = sValues.split(" ");
            newA[newA.length-1]= newA[newA.length-1].toUpperCase();
            String vl= "";
            for(int k = 0; k<newA.length; k++){
                if (k<newA.length-1)vl+=newA[k]+" ";
                else vl+=newA[k];
            }  hashMap.replace(i, sValues, vl);
        }
       System.out.println(hashMap);
    }

}