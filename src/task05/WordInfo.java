package task05;

public class WordInfo {
    private String name;
    public int occurrence;

    public WordInfo(String name) {
        this.name = name;
        this.occurrence = 1;
    }

    public String getName() {
        return name;
    }

    public int getOccurrence() {
        return occurrence;
    }

    public void incrementOccurrence() {
        occurrence += 1;
    }
}
