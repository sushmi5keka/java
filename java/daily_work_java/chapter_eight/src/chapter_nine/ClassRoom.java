
package chapter_nine;

public class ClassRoom {
    
    int number;
    String location;

    public ClassRoom() {
    }

    public ClassRoom(int number, String location) {
        this.number = number;
        this.location = location;
    }

    public static void main(String[] args) {
        ClassRoom cr = new ClassRoom(1, "2nd floor");
        System.out.println("Number : " + cr.getNumber());
        System.out.println("Location : " + cr.getLocation());;
    }
    
    
    public int getNumber() {
        return number;
    }

    public String getLocation() {
        return location;
    }
    
    
}
