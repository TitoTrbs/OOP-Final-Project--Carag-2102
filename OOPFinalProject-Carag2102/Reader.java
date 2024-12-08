import java.util.Scanner;
import java.util.ArrayList;

public class Reader extends User {
    public Reader(String name) {
        super(name);
    }

    @Override
    public void bookUsage(ArrayList<Book> books, Scanner scanner) {
        if (books.isEmpty()) {
            System.out.println("No books available to borrow.");
            return;
        }
    
        boolean borrowing = true;
    
        while (borrowing) {
            System.out.println("\nAvailable books: ");
            for (int i = 0; i < books.size(); i++) {
                System.out.println((i + 1) + ".\n" + books.get(i).showOutput());
            }
            System.out.println("\n=================================\n");
            System.out.println("Enter the number of the book you wish to borrow (or 0 to stop): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
    
            if (choice == 0) {
                borrowing = false;
                System.out.println("Exiting borrowing session.");
                return;
            } else if (choice > 0 && choice <= books.size()) {
                Book selectedBook = books.get(choice - 1);
                if (selectedBook.availability()) {
                    selectedBook.setAvailable(false);
                    System.out.println("You borrowed the book: " + selectedBook.getTitle());
                } else {
                    System.out.println("Sorry, the book is not available.");
                }
    
                System.out.println("Do you wish to continue borrowing? (yes/no): ");
                String continueChoice = scanner.nextLine().trim().toLowerCase();
    
                if (!continueChoice.equals("yes")) {
                    borrowing = false;
                    System.out.println("Exiting borrowing session.");
                }
            } else {
                System.out.println("Error! Invalid choice, or the choice may not be on the list.");
            }
        }
    }
}    

