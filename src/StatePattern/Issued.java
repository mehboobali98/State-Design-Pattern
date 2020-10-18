package StatePattern;

class Issued implements BookState {
    public void issueBook(BookContext ctx) {
        System.out.println("Book is already issued.");

    }

    public void returnBook(BookContext ctx) {
        ctx.setState(new Available());
        System.out.println("Book returned successfully.");

    }

    public void reserveBook(BookContext ctx) {
        System.out.println("Cannot reserve when it has been issued.");

    }
}