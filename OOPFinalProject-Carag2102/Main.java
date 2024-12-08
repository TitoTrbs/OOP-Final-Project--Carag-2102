import java.util.Scanner;
import java.util.ArrayList;


class Main{
public static void main(String[] args){
    ArrayList<Book> books = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    Admin admin = new Admin("Admin", "admin123");
    Reader reader = new Reader("Reader");

    boolean running = true;

    while(running){
        System.out.println("============================================");
        System.out.println("|             Library Manager              |");
        System.out.println("============================================");
        System.out.println(" [1] - User is an Admin");
        System.out.println(" [2] - User is a Reader");
        System.out.println(" [3] - Exit the console");
        System.out.println("Choose from the 3...");
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice){
            case 1:
            System.out.println("Using as admin");
            admin.bookUsage(books, scanner);
            break;
            case 2:
            System.out.println("Using as reader");
            reader.bookUsage(books, scanner);
            break;
            case 3:
            System.out.println("Program will be terminated... \nThank you for using this simple console program!");
            running = false;
            break;
            default:
            System.out.println("That is not included among the options, choose again");
        }


    }
 scanner.close();   
}
}