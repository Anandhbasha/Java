public class ObjectCopy {
    public static void main(String[] args) {
        class Book {
            String title;
            int pages;

            Book(String t, int p) {
                title = t;
                pages = p;
            }

            // Copy Constructor
            Book(Book b) {
                title = b.title;
                pages = b.pages;
            }

            void display() {
                System.out.println(title + " - " + pages + " pages");
            }
        }


        Book b1 = new Book("Java", 500);
        Book b2 = new Book(b1); // Copy Constructor
        b1.display();
        b2.display();
    }

}
