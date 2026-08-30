public class BookLoan {
    String bookName;
    String borrower;
    boolean borrowed;

    void borrowBook() {
        borrowed = true;
        System.out.println(bookName + " has been borrowed.");
    }

    void returnBook() {
        borrowed = false;
        System.out.println(bookName + " has been returned.");
    }

    void displayStatus() {
        System.out.println("Book: " + bookName);
        System.out.println("Borrower: " + borrower);
        System.out.println("Borrowed: " + borrowed);
    }

    public static void main(String[] args) {
        BookLoan book = new BookLoan();

        book.bookName = "Java Programming";
        book.borrower = "Rahul";

        book.borrowBook();
        book.displayStatus();

        book.returnBook();
    }
}
