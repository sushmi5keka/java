
package chapter_nine;

public class Book {
     int id;
     String name;

    public Book() {
    }

    public Book(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {
        Book B =new Book(1, "Java");
        System.out.println("ID : " + B.getId());
        System.out.println("Name : " + B.getName());
    }
    
    
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
      
     
     
}
