// import java.io.FileReader;
// import java.io.FileWriter;
// import java.io.IOException;

// public class Task1 {

//     public static void main(String[] args) {
//         String str = "";
//         try {
//             FileWriter writer = new FileWriter("db.sql");
//             // добавление в конец файла
//             writer.append("Hello!");

//             writer.flush(); // закрытие файла*/

//             FileReader reader = new FileReader("db.sql");
//             while ((reader.ready())) {
//                 str += (char) reader.read(); // читает только char
//             }

//             System.out.println(str);

//         } catch (IOException e) {
//             throw new RuntimeException(e);
//         }
//         String[] ws = str.split("\r\n");
//         System.out.println(ws);
//     }
// }