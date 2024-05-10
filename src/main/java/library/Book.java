package library;

import java.util.ArrayList;

public class Book {

    private String title;
    private String author;
    private String isbn;
    private ArrayList <Book> bookCollection = new ArrayList <Book> ();

    public Book(String title, String author, String isbn){
        this.author = author;
        this.isbn = isbn;
        this.title = title;
    }

    public void setTitle(String title){
        this.title = title;
    }
    public String getTitle(){
        return title;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public String getAuthor(){
        return author;
    }

    public void setIsbn(String isbn){
        this.isbn = isbn;
    }
    public String getIsbn(){
        return isbn;
    }

    public void add_Book(Book book){
        bookCollection.add(book);
    }

    public void removeBook(Book book){
        bookCollection.remove(book);
    }

    public ArrayList <Book> get_Collection(){
        return bookCollection;
    }

}
