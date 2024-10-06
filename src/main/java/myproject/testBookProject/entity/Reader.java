package myproject.testBookProject.entity;

import java.util.List;
import java.util.UUID;

public class Reader {
    private String name;
    private UUID readerId;
    private List<Book> borrowedBooks;

    public Reader() {
    }

    public Reader(String name, List<Book> borrowedBooks) {
        this.name = name;
        this.readerId = UUID.randomUUID();
        this.borrowedBooks = borrowedBooks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UUID getReaderId() {
        return readerId;
    }

    public void setReaderId(UUID readerId) {
        this.readerId = readerId;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(List<Book> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }
}
