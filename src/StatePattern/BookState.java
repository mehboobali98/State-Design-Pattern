package StatePattern;

public interface BookState {
    void issueBook(BookContext ctx);
    void returnBook(BookContext ctx);
    void reserveBook(BookContext ctx);
}

