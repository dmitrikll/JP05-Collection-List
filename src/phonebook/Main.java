package phonebook;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        Phonebook phonebook = new Phonebook();

        phonebook.add(new Entry("John", "123-456-789"));
        phonebook.add(new Entry("Jack", "345-678-234"));
        phonebook.add(new Entry("Jim", "345-678-234"));

        Entry findEntry = phonebook.find("Jack");
        if (findEntry != null) {
            System.out.println("Find entry: " + findEntry.getName() + " - " + findEntry.getPhone());
        } else {
            System.out.println("Entry not found.");
        }

        List<Entry> allEntries = phonebook.findAll("Jack");
        if (allEntries != null) {
            System.out.println("All entries for " + allEntries.getFirst().getName() + ":");
            for (Entry entry : allEntries) {
                System.out.println(entry.getName() + " - " + entry.getPhone());
            }
        } else
            System.out.println("Entry not found.");
    }

}
