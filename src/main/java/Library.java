import java.util.ArrayList;

public class Library {

    private ArrayList<Book> collection;
    private int maxCapacity;

    public Library(){
        this.collection = new ArrayList<Book>();
        this.maxCapacity = 3;

    }

    public int getLibrarySize(){
       return this.collection.size();
    }

    public void add(Book book) {
        if (this.collection.size() < this.maxCapacity){
            this.collection.add(book);
        }
    }

    public void updateCapacity(boolean returning){
        if(returning == true){
            this.maxCapacity +=1;
        }else{this.maxCapacity -=1;}
    }

    public void lend(Borrower borrower, Book bookWanted){

        for (Book book: this.collection) {
            if (bookWanted == book) {
                this.collection.remove(book);

                borrower.addBook(bookWanted);
            }
        }
    }
    public boolean isInList(Book book) {
        boolean inList = false;
        for (Book bookToCheck : this.collection) {
            if (bookToCheck == book) {
                return inList = true;
            }

        }
        return inList;
    }

    public void removeFromLibrary(Book bookRemoved){
//        for (Book book: this.collection){
//            if (bookRemoved == book){
//                this.collection.remove(book);
//                this.updateCapacity(false);
//            }
//        }
        boolean checked = this.isInList(bookRemoved);
        if (checked == true){
            this.collection.remove(bookRemoved);
            this.updateCapacity(false);
        }
    }

    public int getMaxCapacity() {
        return this.maxCapacity;
    }
}
