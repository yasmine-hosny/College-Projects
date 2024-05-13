package ds;

import java.util.Scanner;

public class LinkedList {
    static Node head = null; 
    
    public boolean isEmpty() {
        return (head == null);        
    }

//    static Node CreateNode(int value){
//        Node newnode = new Node();
//        if(newnode != null){
//            newnode.data = value;
//            newnode.next = null;
//        }
//        return newnode;
//    }

    public void addBook(String name) {
        Node newnode = new Node();
        newnode.data = name;
        if(isEmpty()) {
            newnode.next = null;
            head = newnode;
        }
        else {
            newnode.next = head;
            head = newnode;
        }
    }
    
    public void append(String name) {
        if(isEmpty())
            addBook(name);
        else {
            Node temp = head;
            while(temp.next != null) {
                temp = temp.next;
            }
            Node newnode = new Node();
            newnode.data = name;
            temp.next = newnode;
            newnode.next = null;
        }        
    }
    
    public void display() {
        Node temp = head;
        while(temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }        
    }
    
    public int count() {
        Node temp = head;
        int count = 0;
        while(temp != null) {
            count++;
            temp = temp.next;
        }     
        return count;
    }
    
    public boolean SearchBook(String name) {
        boolean found = false;
        Node temp = head;
        while(temp != null) {
            if(temp.data == name){
                found = true;
                temp = temp.next;
            }
        }
        return found; 
    }
    
    public void delBook(String name) {
        if(isEmpty())
            System.out.println("There isn't Book");
        if(head.data == name) {
            Node delptr = head;
            head = head.next;
        }
        else {
            Node prev = null;
            Node delptr = head;
            while(delptr.data != name) {
                prev = delptr;
                delptr = delptr.next;
            }
            prev.next = delptr.next;
            }       
    }
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Book b1 = new Book(123, "Happy", "Shrok", 500, "English", "Printer", "Police","Available");
        Book b2 = new Book(123, "Cat", "Zinab", 500, "English", "Printer", "Police","Available");
        Book b3 = new Book(123, "apple", "Yasmine", 500, "English", "Printer", "Romantic","Available");  
        Book b4 = new Book();
        Transaction t1 = new Transaction();
        Student s1 = new Student("Yasmine", "123", "@email", "mndara", "Alexandria");
        Admain admain = new Admain("Yasmine", "123", "@email", "mndara", "Alexandria");
        Node n = new Node();
        LinkedList link = new LinkedList();
        
        link.addBook("happy");

        
        System.out.println("please enter your Id");
        s1.setId(input.nextInt());
        System.out.println("please enter your password");
        s1.setPassword(input.nextInt());
        t1.choose(1);
        
    
    }
    
//    public void reserveBook() {
//        System.out.println("please enter book name");
//                String name = input.next();
//                if(link.SearchBook(name)) {
//                    System.out.println("reserved Book");
//                    System.out.println("**********");
//                    System.out.println("choose 1 => if you want to reserve a book");
//                    System.out.println("choose 2 => if you want to back a step");
//                    System.out.println("choose 3 => if you want to exist");
//                    int x = input.nextInt();
//                    switch(x) {
//                        case 1:
//                            
//                            
//                        break;
//                        case 2:
//                            display();
//                        break;
//                        case 3:
//                            System.out.println("you see later, bye");
//                            System.exit(0);
//                        break;
//                        default:
//                            System.out.println("invalid number");
//                    }
//    }
    
}
