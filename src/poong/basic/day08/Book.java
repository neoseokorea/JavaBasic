package poong.basic.day08;

public class Book {

    private String bookName;
    private String author;
    private String trans;
    private String pub;
    private String pubDate;
    private int price;
    private double discount;
    private int point;


    public Book() {
    }

    public Book(String bookName, String author, String trans, String pub, String pubDate, int price, double discount, int point) {
        this.bookName = bookName;
        this.author = author;
        this.trans = trans;
        this.pub = pub;
        this.pubDate = pubDate;
        this.price = price;
        this.discount = discount;
        this.point = point;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTrans() {
        return trans;
    }

    public void setTrans(String trans) {
        this.trans = trans;
    }

    public String getPub() {
        return pub;
    }

    public void setPub(String pub) {
        this.pub = pub;
    }

    public String getPubDate() {
        return pubDate;
    }

    public void setPubDate(String pubDate) {
        this.pubDate = pubDate;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }


} // class Book
