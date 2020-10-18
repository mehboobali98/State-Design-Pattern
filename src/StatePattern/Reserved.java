package StatePattern;

public class Reserved implements BookState {
    public void issueBook(BookContext ctx) {
        ctx.setState(new Issued());
        System.out.println("Book issued successfully.");
    }

    public void returnBook(BookContext ctx) {
        System.out.println("You have to get it issued first.");
    }

    public void reserveBook(BookContext ctx) {
        System.out.println("Book is already reserved.");
    }
}
