// import java.io.FileReader;
// import java.io.FileWriter;
// import java.io.IOException;
// public class Task2 {
//     public static void main (String[] args) {
//         String str = "";
//         try {
//             FileWriter writer = new FileWriter("db.sql");
//              // добавление в конец файла
//             writer.append("Семёнов Алексей Геннадьевич 43 М\n");
//             writer.append("Сидоров Павел Иннокентьевич 19 М\n");
//             writer.append("Арутюнян Белла Олеговна 25 Ж\n");
//             writer.append("Горбань Анна Артёмовна 33 Ж\n");
//             writer.append("Сидоров Александр Сергеевич 23 М\n");
//             writer.append("Цын Алёна Петровна 65 Ж\n");
//             writer.append("Петров Петр Сергеевич 19 М\n");
//             writer.append("Янковский Нестор Николаевич 29 М\n");
//             writer.append("Мелешко Валентина Петровна 30 Ж\n");
          
//             writer.flush(); // закрытие файла*/

//             FileReader reader = new FileReader("db.sql");
//             while ((reader.ready())) {
//                 str += (char) reader.read(); // читает только char
//             }

//             System.out.println(str);

//         } catch (IOException e) {
//             throw new RuntimeException(e);
//         }
//         String[] ws= str.split("\r\n"); 
//         System.out.println(ws);
//     }
// }