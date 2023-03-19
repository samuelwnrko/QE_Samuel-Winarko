package org.example.pack;

import java.util.UUID;

public class Book {
    private String id;

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    private String judul;
    private String penulis;
    private String category;

    public Book(String judul, String penulis, String category) {
        this.id = UUID.randomUUID().toString();
        this.judul = judul;
        this.penulis = penulis;
        this.category = category;
    }

    public String getID() { return id; }

    public String getJudul() { return judul; }

    public String getPenulis() { return penulis; }

    public String getCategory() { return category; }
}
