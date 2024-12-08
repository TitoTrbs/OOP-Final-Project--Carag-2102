class Book {
    private String title;
    private String author;
    private String publisher;
    private boolean availability;

    public Book(String title, String author, String publisher) {
        this.title = title;
        this.author = author;
        this.publisher = publisher; 
        this.availability = true; 
    }

    // Getters and Setters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
    public String getPublisher(){
        return publisher;
    }
    public boolean availability() {
        return availability;
    }

    public void setAvailable(boolean available) {
        this.availability = available;
    }

    public String showOutput() {
        return "================================\n"+
        "Title: " + title + 
        "\nAuthor: " + author + 
        "\nPublisher: "+ publisher+
        "\nAvailable: " + (availability() ? "Yes\n" : "No\n")
        + "================================\n";
        
    }
}