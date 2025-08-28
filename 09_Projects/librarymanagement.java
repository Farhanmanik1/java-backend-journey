class Book {
    String title;
    String author;
    boolean isAvailable;

    Book(String title, String author, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.isAvailable = isAvailable;
    }

    public void borrow() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("You borrowed: " + title + " by " + author);
        } else {
            System.out.println(title + " is already borrowed.");
        }
    }

    public void returnBook() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println("You returned: " + title + " by " + author);
        } else {
            System.out.println("You never borrowed " + title + ".");
        }
    }
}

public class librarymanagement {
    public static void main(String[] args) {
        Book b1 = new Book("Mein Kampf", "Adolf Hitler", true);
        Book b2 = new Book("Invent and Wander", "Jeff Bezos", true);
        Book b3 = new Book("Elon Musk", "Walter Isaacson", true);
        Book b4 = new Book("The Facebook Effect", "David Kirkpatrick", true);
        Book b5 = new Book("Tools for Humanity", "Sam Altman", true);

        b1.borrow();
        b1.borrow();
        b3.borrow();
        b1.returnBook();
        b1.returnBook();
    }
}
