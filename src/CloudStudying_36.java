class Book{
    private String title;
    private int price;
    private boolean isBorrowed;

    public Book(String title, int price, boolean isBorrowed){
        this.title = title;
        this.price = price;
        this.isBorrowed = isBorrowed;
    }

    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }

    public boolean getIsBorrowed() {
        return isBorrowed;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setIsBorrowed(boolean borrowed) {
        this.isBorrowed = borrowed;
    }

    public String toString(){
        return "["+this.title+"] "+this.getPrice()+"원, 대여중? "+this.getIsBorrowed();
    }

    public void rented(){
        this.isBorrowed = true;
    }

    public void returned(){
        this.isBorrowed = false;
    }
}

public class CloudStudying_36 {

    public static void main(String[] args){
        Book[] books = new Book[3];
        books[0] = new Book("나루토", 3500, false);
        books[1] = new Book("맥심", 14000, false);
        books[2] = new Book("사전", 5000, true);

        System.out.println(books[0].toString()); // [나루토] 3500원, 대여중? false
        books[0].rented();
        System.out.println(books[0].toString()); // [나루토] 3500원, 대여중? true
        books[0].returned();
        System.out.println(books[0].toString()); // [나루토] 3500원, 대여중? false

    }
}
