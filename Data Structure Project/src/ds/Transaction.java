package ds;

import java.util.Scanner;

public class Transaction extends LinkedList {
    Book b1 = new Book(123, "sad", "Shrok", 500, "English", "Printer", "Police","Available");
    Scanner input = new Scanner(System.in);

    public void display() {
        System.out.println("             Student choose");
        System.out.println("choose 1 => if you want to search about book");
        System.out.println("choose 2 => if you want to know information about book");
        System.out.println("choose 3 => if you want to know information about Admain");
        System.out.println("choose 4 => if you want to return book");
        System.out.println("choose 5 => if you want to exist");
    }        
    
    public void choose(int num) {
        switch(num) {
            case 1:
                System.out.println("please enter book name");
                String name = input.next();
                if(SearchBook(name)) {
                    System.out.println("reserved Book");
                    System.out.println("**********");
                    System.out.println("choose 1 => if you want to reserve a book");
                    System.out.println("choose 2 => if you want to back a step");
                    System.out.println("choose 3 => if you want to exist");
                    int x = input.nextInt();
                    switch(x) {
                        case 1:
                            
                            
                        break;
                        case 2:
                            display();
                        break;
                        case 3:
                            System.out.println("you see later, bye");
                            System.exit(0);
                        break;
                        default:
                            System.out.println("invalid number");
                    }
                }
                else {
                    System.out.println("Available Book");
                    System.out.println("**********");
                    System.out.println("choose 1 => if you want to reserve a book");
                    System.out.println("choose 2 => if you want to back a step");
                    System.out.println("choose 3 => if you want to exist");
                    int x = input.nextInt();
                    switch(x) {
                        case 1:
                            addBook(name);
                            System.out.println("you reserved the book");
                            System.out.println("you return it after five days");
                            System.out.println("**********");
                            System.out.println("choose 1 => if you want to back a step");
                            System.out.println("choose 2 => if you want to exist");
                            int y = input.nextInt();
                            switch(y) {
                                case 1:
                                    display();
                                break;
                                case 2:
                                    System.out.println("you see later, bye");
                                    System.exit(0);
                                break;
                                default:
                                    System.out.println("invalid number");
                                break;
                            }
                        break;
                        case 2:
                            display();
                        break;
                        case 3:
                            System.out.println("you see later, bye");
                            System.exit(0);
                        break;
                        default:
                            System.out.println("invalid number");
                    }
                }
        }
    }
}
