package task05;

import java.util.ArrayList;
import java.util.List;

public class WordOccurrences {

    public List<WordInfo> findOccurrences(List<String> wordList) {
        List<WordInfo> findWord = new ArrayList<>();

        for (String word:wordList) {
            boolean found = false;
            for (WordInfo wordInfo:findWord) {
                if (wordInfo.getName().equals(word)) {
                    wordInfo.incrementOccurrence();
                    found = true;
                    break;
                }
            }
            if (!found) {
                findWord.add(new WordInfo(word));
            }
        }
        return findWord;
    }
}
