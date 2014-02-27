/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Entity;

/**
 *
 * @author Trung
 */
public class Book {
    
    private int id;
    private String sender;
    private String title;
    private String author;
    private String category;
    private String cover;
    private int rating;
    private String comment;

    public Book() {
    }

    public Book(int id, String sender, String title, String author, String category, String cover, int rating, String comment) {
        this.id = id;
        this.sender = sender;
        this.title = title;
        this.author = author;
        this.category = category;
        this.cover = cover;
        this.rating = rating;
        this.comment = comment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
    
    @Override
    public String toString() {
        return "{id: " + this.id + ", sender: " + this.sender + ", title: " + this.title + ", author: " + this.author + ", rating: " + this.rating + "}";
    }
}