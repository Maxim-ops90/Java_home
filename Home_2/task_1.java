package Home_2;

public class task_1 {
    String str = "ABCDEFJK hello my dear friend!";
  
        int indexL = str.indexOf("C"); // Ищем символ в строке
        int indexWord = str.indexOf("friend"); // Ищем слово в строке
  
        if(indexL == - 1) {
           System.out.println("Символ \"AA\" не найден.");
        } else {
           System.out.println("Символ \"AA\" найден, его индекс: " + indexL);
        }
  
        if(indexWord == - 1) {
           System.out.println("Слово \"friend\" не найдено.");
        } else {
           System.out.println("Слово \"friend\" найдено, его индекс: " + indexWord);
        }
     }
  

