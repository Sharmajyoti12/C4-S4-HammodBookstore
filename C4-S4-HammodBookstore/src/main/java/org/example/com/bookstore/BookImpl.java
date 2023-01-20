/*Author name: Jyoti Sharma
 * DATE:12/30/2022
 *Created With:Intellij IDEA Community Edition
 */

package org.example.com.bookstore;


import org.example.Author;
import org.example.Book;

public class BookImpl {
    public static void main(String[] args) {
        Book book=new Book("234567","rich dad poor ");
         Author author=new Author("Robert","robertFrank");
        System.out.println("author.getPenName() = " + author.getPenName());
        System.out.println("author.toString() = " + author.toString());
        book.displayBookDetails();
    }

}
