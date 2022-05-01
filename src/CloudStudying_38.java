import java.util.ArrayList;

class BookCafe {
    private String name;
    private String address;
    private ArrayList<Book1> books = new ArrayList<>();
    private ArrayList<Drink> drinks = new ArrayList<>();

    public BookCafe(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<Book1> getBooks() {
        return books;
    }

    public ArrayList<Drink> getDrinks() {
        return drinks;
    }

    public void addBook(Book1 newBook) {
        books.add(newBook);
    }

    public void addDrink(Drink newDrink) {
        drinks.add(newDrink);
    }

    public void deleteBook(Book1 book) {
        int index = 0;
        String title = book.getTitle();
        ArrayList<Book1> books = getBooks();
        while (!(title.equals(books.get(index).getTitle()))) {
            index++;
        }
        books.remove(index);
    }

    public void deleteDrink(Drink drink) {
        int index = 0;
        String title = drink.getName();
        ArrayList<Drink> drinks = getDrinks();
        while (!(title.equals(drinks.get(index).getName()))) {
            index++;
        }
        drinks.remove(index);
    }

    public void showBooks(){
        ArrayList<Book1> books = getBooks();
        for(int i=0; i < books.size(); i++){
            System.out.println(books.get(i).getTitle());
        }
    }

    public void showDrinks(){
        ArrayList<Drink> drinks = getDrinks();
        for(int i=0; i < drinks.size(); i++){
            System.out.println(drinks.get(i).getName());
        }
    }
    void showCafeInfo() {
        System.out.println("이름: " + getName());
        System.out.println("주소: " + getAddress());
        showBooks();
        showDrinks();
    }
}

class Book1{
    private String title;

    public Book1(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getInfo(){
        return getTitle();
    }
}

class Drink{
    private String name;
    private int price;

    public Drink(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getInfo(){
        return "음료 이름 : "+getName()+" 음료 가격 : "+getPrice();
    }

}
public class CloudStudying_38 {

    public static void main(String[] args) {
        BookCafe itCafe = new BookCafe("IT 카페", "신림역 3번출구");
        Book1 book1 = new Book1("title1");
        Book1 book2 = new Book1("title2");
        itCafe.addBook(book1);
        itCafe.addBook(book2);

        Drink drink1 = new Drink("drink1", 1000);
        Drink drink2 = new Drink("drink2", 2000);
        itCafe.addDrink(drink1);
        itCafe.addDrink(drink2);

        itCafe.showCafeInfo();

        itCafe.deleteBook(book1);
        itCafe.deleteDrink(drink1);

        itCafe.showCafeInfo();
    }
}
