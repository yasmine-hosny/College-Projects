package ds;

import java.util.Scanner;

public class Book {
    Scanner input = new Scanner(System.in);
    private int id;
    private String name;
    private String author;
    private int pageNum;
    private String language;
    private String publicher;    
    private String type;
    private String state;

    public Book() {
    }

    public Book(int id, String name, String author, int pageNum, String language, String publicher, String type, String state) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.pageNum = pageNum;
        this.language = language;
        this.publicher = publicher;
        this.type = type;
        this.state = state;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getPublicher() {
        return publicher;
    }

    public void setPublicher(String publicher) {
        this.publicher = publicher;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void addBook() {
        System.out.println("Enter Book Id");
        int x = input.nextInt();
        setId(x);
        System.out.println("Enter Book Name");
        String ch = input.next();
        setName(ch);
        System.out.println("Enter Book Author");
        ch = input.next();
        setAuthor(ch);
        System.out.println("Enter Number of Pages of the Book");
        x = input.nextInt();
        setPageNum(x);
        System.out.println("Enter Book Language");
        ch = input.next();
        setLanguage(ch);
        System.out.println("Enter Publisher");
        ch = input.next();
        setPublicher(ch);
        System.out.println("Enter Book Type");
        ch = input.next();
        setType(ch);
        System.out.println("Enter Book State");
        ch = input.next();
        setState(ch);
    }
    
    @Override
    public String toString() {
        return "Book{" + "id=" + id + ", name=" + name + ", author=" + author + ", pageNum=" + pageNum + ", language=" + language + ", publicher=" + publicher + ", type=" + type + ", state=" + state + '}';
    }
}
