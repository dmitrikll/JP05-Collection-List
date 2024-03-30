package task05;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        WordOccurrences wordOccurrences = new WordOccurrences();

        List<String> wordList = new ArrayList<>();
        wordList.add("mango");
        wordList.add("kiwi");
        wordList.add("banana");
        wordList.add("melon");
        wordList.add("mango");
        wordList.add("cherry");
        wordList.add("mango");
        wordList.add("grape");
        wordList.add("kiwi");
        wordList.add("melon");
        wordList.add("olive");
        wordList.add("kiwi");

        List<WordInfo> occurrences = wordOccurrences.findOccurrences(wordList);
        for (WordInfo wordInfo:occurrences) {
            System.out.println("name: " + wordInfo.getName() + ", occurrence: " + wordInfo.getOccurrence());
        }
    }
}
