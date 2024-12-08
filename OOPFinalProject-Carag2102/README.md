
# BooKeep: Library Manager

**BooKeep Library Manager** is a console program that helps libraries to manage borrows and add books into the library. With the principles of Object Oriented Programming, the library manager will be functional, being able to hide necessary data from the users, with different classes that shows how Object Oriented Programming could be applied even on simple programs like these. A deep explanation of how the OOP principles helped the program will be elaborated on the latter part. 





## Object Oriented Programming Principles

There are four core principles of Object Oriented Programming, known as Encapsulation, Polymorphism, Abstraction, and Inheritance.

1. *Encapsulation*
The use of different classes is the basic application of Encapsulation. The program was divided into 4 different classes, excluding the main program, which are:
* `public class Book`
* `abstract class User`
* `public class Reader`
* `public class Admin`

There is also an application of Access Modifiers on the program, where data were being held private, unless given access using getters and setters. 

2. *Inheritance*
Inheritance was implemented on 3 classes, on which 1 class is the parent class and the 2 others. The parent class is the `User` class, and its children are `Reader` and `Admin` Class.

 **The parent class, `User` class:**
 User is the parent class of the 2 children. It only includes abstract class and fucntions, to be explained later on the 3rd OOP principle. 


**The child class, `Reader` class:**
`Reader` extends `User` class, which means it inherits the functions, methods, and objects under the `User` class. Inside this child class, the method bookUsage was used for readers to view books available and to borrow books.

**The child class, `Admin` class:**
`Admin` extends `User` class, which also means that it also inherits the functions, methods, and obejcts under the `User` class. The bookUsage method under it is used to add books into the library.

3. *Abstraction*
Abstraction was implemented on the classes from the previous principle. The `User` class was simply an abstract class, and the children class should inherit all of its content to function.

4. *Polymorphism*
Polymorphism was implemented also in the `User` class, where the user took 2 different forms, which is the `Admin` and `Reader`. 


## SDGs Application into the system

1.**Quality Education** -  libraries are essential for students especially on higher forms of education, and helping libraries be more efficient can help its effectiveness and students can utilize the library more because it has a better system, which is a faster way for it to be utilized. 

2.**Industry, Innovation, and Infrastructure**- systems like these could help on mobilizing industries because small scale changes on smaller systems could give big impact, like improving the library system, it can help not only students, but also people in the industry to research efficiently because it is less hassle for them to learn more through the books in the library.

3.**Responsible Consumption and Production**- promoting libraries using systems like these helps people become responsible consumers because instead of buying books, reading it for once, and for it only to end up on their shelves because they’re done reading it, they can just borrow books, and return it after reading. This way, we can lessen the production of books, because producing things that are used only for once could lead to other problems. 
## Instructions

1. When the program is executed, the main function will show three choices, which are: `[1] - User is an Admin`,  `[2] - User is a Reader`, and `[3] - Exit the console` to be toggled with the number corresponding. 
2. When `Admin` is chosen, it will ask for the admin first, which was set to default as **admin123**.  When accessed, it will also show 3 options, which are:

    `[1] Add a Book`
    `[2] View All Books`
    `[3] Exit Admin Menu`

    On the add book, the admin can add book details, which includes Title, Author, and Publisher. On the view all books, it will only show all the books that were added into the program. Lastly, the last option will exit the admin menu, returning to the main menu.

3. When `Reader` is selected, it will ask the the user the number of the book that they wish to borrow. After borrowing, it will ask if the user wishes to borrow more books.

4. Lastly, the `Exit` will completely terminate the program.