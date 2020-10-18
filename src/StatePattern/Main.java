package StatePattern;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BookContext b = new BookContext("Kamasutra");
        b.issueBook(b);
        b.issueBook(b);
        b.reserveBook(b);
        b.issueBook(b);
        b.returnBook(b);
        b.reserveBook(b);
        b.issueBook(b);

    }
}
