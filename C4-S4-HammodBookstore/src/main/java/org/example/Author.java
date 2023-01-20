/*Author name: Jyoti Sharma
 * DATE:12/30/2022
 *Created With:Intellij IDEA Community Edition
 */

package org.example;

public class Author  {
    public Author(String authorName, String penName) {
        this.authorName = authorName;
        this.penName = penName;
    }

    String authorName;

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getPenName() {
        return penName;
    }

    @Override
    public String toString() {
        return "Author{" +
                "authorName='" + authorName + '\'' +
                ", penName='" + penName + '\'' +
                '}';
    }

    public void setPenName(String penName) {
        this.penName = penName;
    }

    String penName;

}
