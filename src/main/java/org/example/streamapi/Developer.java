package org.example.streamapi;

import java.util.HashSet;
import java.util.Set;

public class Developer {
    private Integer id;
    private String name;
    private Set<String> book;

    //getters, setters, toString

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Set<String> getBook() {
        return book;
    }

    public void addBook(String book) {
        if (this.book == null) {
            this.book = new HashSet<>();
        }
        this.book.add(book);
    }

    public void setName(String mkyong) {
        this.name = mkyong;
    }
}
