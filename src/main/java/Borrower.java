import java.util.ArrayList;

public class Borrower {
    private String name;
    private ArrayList<Book> booksBorrowed;
    private int maxNumberAllowed;

    public Borrower(String name){
        this.name = name;
        this.booksBorrowed = new ArrayList<Book>();
        this.maxNumberAllowed = 2;
    }

    public String getName(){
        return this.name;
    }

    public int getNumberOfBooks() {
        return this.booksBorrowed.size();
    }


    public String getBooksTitle(int i) {
        String bookTitle;
        Book book = this.booksBorrowed.get(i);
        return bookTitle = book.getBookTitle();
    }
    private void updateMaxNumberAllowed(boolean checkout) {
        if (checkout = true){
            this.maxNumberAllowed-=1;
        }else{this.maxNumberAllowed+=1;}
    }

    public void addBook(Book book) {
        if (this.booksBorrowed.size()<=this.maxNumberAllowed) {

            this.booksBorrowed.add(book);
            this.updateMaxNumberAllowed(true);
        }
    }

    public boolean isInList(Book book) {
        boolean inList = false;
        for (Book bookToCheck : this.booksBorrowed) {
            if (bookToCheck == book) {
                return inList = true;
            }

        }
        return inList;
    }

    public void removeBook(Book bookToRemove) {
        Book book;
//        for (Book borrowedBook: this.booksBorrowed){
//            if (borrowedBook == bookToRemove) {
//                this.booksBorrowed.remove(borrowedBook);
//                this.updateMaxNumberAllowed(false);
//                }
//            }
            boolean checked = this.isInList(bookToRemove);
            if (checked == true){
                this.booksBorrowed.remove(bookToRemove);
                this.updateMaxNumberAllowed(false);
            }
//        this.booksBorrowed.removeIf(borrowedBook -> borrowedBook==bookToRemove);
        }

}
