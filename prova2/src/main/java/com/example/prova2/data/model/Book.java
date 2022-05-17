package com.example.prova2.data.model;

import jakarta.persistence.*;

@Entity
@Table(name = "book")
public class Book extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title", nullable = false)
    private String title;

//    @ManyToOne(cascade = CascadeType.ALL)
//    @Column(name = "author", nullable = false)
//    private Author author;

    public Book(Long id, String title, Author author) {
        this.id = id;
        this.title = title;
//        this.author = author;
    }

    public Book() {

    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

//    public Author getAuthor() {
//        return author;
//    }
//
//    public void setAuthor(Author author) {
//        this.author = author;
//    }
}