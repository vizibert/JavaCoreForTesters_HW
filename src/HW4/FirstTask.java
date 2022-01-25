package HW4;

import java.util.*;

public class FirstTask {

    public static void main(String[] args) {
        List<String> words = new ArrayList<>(Arrays.asList(
                "bikes",
                "welcome",
                "separate",
                "grubby",
                "charge",
                "unique",
                "angle",
                "healthy",
                "itch",
                "chivalrous",
                "pocket",
                "productive",
                "welcome",
                "angle",
                "angle",
                "pocket"));

        System.out.println("List of words: " + words);

        printDivider();

        Set<String> uniqueWords = new HashSet<>(words);
        System.out.println("Unique words in the list: " + uniqueWords);

        printDivider();

        Map<String, Integer> wordCounter = new HashMap<>();
        for (String word : words) {
            if (!wordCounter.containsKey(word)) {
                wordCounter.put(word, 1);
            } else {
                wordCounter.put(word, wordCounter.get(word) + 1);
            }
        }
        System.out.println("Word count in the list: "+ wordCounter);
    }

    public static void printDivider() {
        System.out.println("-------------------------");
    }

}