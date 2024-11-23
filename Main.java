import java.util.*;
import java.lang.*;


public class Main {
    public static void main(String[] args) {

        String[] words = {
                "Алёна", "Михаил","Малика", "Ева", "Максим",
                "Виктория","Андрей", "Полина","Алёна", "Михаил","Мария", "Марина", "Арина", "Евдокия",
                "Глеб", "Адам", "Тимофей"
        };


        Map<String, Integer> wordCount = new HashMap<>();


        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }


        Set<String> uniqueWords = new HashSet<>(wordCount.keySet());

        System.out.println("Уникальные слова: " + uniqueWords);


        System.out.println("Количество вхождений слов:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
