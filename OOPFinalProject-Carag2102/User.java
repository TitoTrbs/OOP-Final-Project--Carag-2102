import java.util.Scanner;
import java.util.ArrayList;

abstract class User {
    protected String name;

    public User(String name){
        this.name = name;
    }
    public abstract void bookUsage(ArrayList<Book> books, Scanner scanner);
}
