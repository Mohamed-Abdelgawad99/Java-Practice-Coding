package library;

import java.util.ArrayList;

public class BookMain {

    public static void main(String args[]){

        Book book1 = new Book("Happy Potter 1", "J.K.Rolling","112233");
        Book book2 = new Book("Intro. To Programming", "Chalres","44553");

        book1.add_Book(book1);
        book1.add_Book(book2);

        ArrayList <Book> collection = book1.get_Collection();

        for (Book book : collection){
            System.out.println(book.getTitle() + " by " + book.getAuthor() + ", ISBN: " + book.getIsbn());
        }

    }
}
