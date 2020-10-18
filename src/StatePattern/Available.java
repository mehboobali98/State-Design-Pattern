package StatePattern;

class Available implements BookState {

    public void issueBook(BookContext ctx) {
        ctx.setState(new Issued());
        System.out.println("Book issued successfully.");
    }

    public void returnBook(BookContext ctx) {
        System.out.println("No need to return the book.");
    }

    public void reserveBook(BookContext ctx) {
        ctx.setState(new Reserved());
        System.out.println("Book reserved successfully.");

    }
}