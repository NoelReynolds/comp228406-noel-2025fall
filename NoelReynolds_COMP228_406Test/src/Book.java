public abstract class Book
{
    //Variables
    private String title;
    private String desc; //Description
    private String auth; //Author
    private String pub; //Publisher
    public double price;
    private String isbn;
    private int year;

    //Constructors
    public Book()
    {
        this.title = "Unknown Title";
        this.desc = "Unknown Description";
        this.auth = "Unknown Author";
        this.pub = "Unknown Publisher";
        this.price = 0;
        this.isbn = "Unknown ISBN";
        this.year = 0;
    }

    //Setters
    public void setTitle(String _title) {
        this.title = _title;
    }
    public void setDesc(String _desc) {
        this.desc = _desc;
    }
    public void setAuth(String _auth) {
        this.auth = _auth;
    }
    public void setPub(String _pub) {
        this.pub = _pub;
    }
    public void setIsbn(String _isbn) {
        this.isbn = _isbn;
    }
    public void setYear(int _year) {
        this.year = _year;
    }

    //Methods
    @Override
    public String toString() {
        return "Title: " + this.title + "\nDesc: " + this.desc + "\nAuthor: " + this.auth + "\nPublisher: " + this.pub +
                "\nPrice: " + this.price + "\nISBN: " + this.isbn + "\nPublished: " + this.year;
    }

    public String getTitle() {
        return this.title;
    }
    public String getDesc() {
        return this.desc;
    }
    public String getAuth() {
        return this.auth;
    }
    public String getPub() {
        return this.pub;
    }
    public String getIsbn() {
        return this.isbn;
    }
    public int getYear() {
        return this.year;
    }

    //Abstract Methods
    public abstract void setPrice(double _price);

    public abstract String getGenre();
}
