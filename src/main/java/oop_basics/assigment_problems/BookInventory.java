package oop_basics.assigment_problems;

public class BookInventory {
    private String title;
    private String author;
    private int copiesAvailable;

    public BookInventory(String title, String author, int copiesAvailable) {
        this.title = title;
        this.author = author;
        this.copiesAvailable = copiesAvailable;
    }

    public void printEntry() {
        System.out.println(title + " by " + author + " - " + copiesAvailable + " copies available");
    }

    public String getFormattedEntry() {
        return title + " by " + author + " - " + copiesAvailable + " copies available";
    }
}
