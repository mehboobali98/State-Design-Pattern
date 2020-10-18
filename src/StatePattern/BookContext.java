package StatePattern;

class BookContext implements BookState {

    BookState currentState;
    String name;

    BookContext(String n) {
        this.name = n;
        this.currentState = new Available();
    }

    public void setState(BookState state) {
        this.currentState = state;
    }

    public void issueBook(BookContext ctx) {
        this.currentState.issueBook(this);
    }

    public void returnBook(BookContext ctx) {
        this.currentState.returnBook(this);

    }

    public void reserveBook(BookContext ctx) {
        this.currentState.reserveBook(this);
    }
}