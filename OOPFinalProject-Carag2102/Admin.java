import java.util.Scanner;
import java.util.ArrayList;

public class Admin extends User {
    private String password; // Admin password

    public Admin(String name, String password) {
        super(name);
        this.password = password;
    }

    @Override
    public void bookUsage(ArrayList<Book> books, Scanner scanner) {
        System.out.print("Enter admin password: ");
        String enteredPassword = scanner.nextLine();

        if (!enteredPassword.equals(password)) {
            System.out.println("Incorrect password. Access denied.");
            return; // Exit if the password is incorrect
        }

        boolean managingBooks = true;

        while (managingBooks) {
            System.out.println("============================================");
            System.out.println("|               Admin Menu                 |");
            System.out.println("============================================");
            System.out.println("[1] Add a Book");
            System.out.println("[2] View All Books");
            System.out.println("[3] Exit Admin Menu");
            System.out.print("Choose from [1] to [3]: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1: // Add a book
                    System.out.print("Enter the title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter the author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter the publisher: ");
                    String publisher = scanner.nextLine();

                    books.add(new Book(title, author, publisher));
                    System.out.println("Book was added successfully...");
                    break;

                case 2: // View all books
                    if (books.isEmpty()) {
                        System.out.println("No books available.");
                    } else {
                        System.out.println("\nBooks in Library:");
                        for (int i = 0; i < books.size(); i++) {
                            System.out.println((i + 1) + ". " + books.get(i).showOutput());
                        }
                    }
                    break;

                case 3: // Exit admin menu
                    System.out.println("Exiting Admin Menu...");
                    managingBooks = false;
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
