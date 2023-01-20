/*Author name: Jyoti Sharma
 * DATE:12/30/2022
 *Created With:Intellij IDEA Community Edition
 */

package org.example;

public class Book   {
    String IsbnNumber;
    String tittle;

    Author author;
public void displayBookDetails()
{
    System.out.println("IsbnNumber = " + this.getIsbnNumber());
    System.out.println(" book title= " + this.getTittle());

}
    public Book(String isbnNumber, String title) {
        IsbnNumber = isbnNumber;
        this.tittle = title;
    }

    public String getIsbnNumber() {
        return IsbnNumber;
    }

    public void setIsbnNumber(String isbnNumber) {
        IsbnNumber = isbnNumber;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }
}