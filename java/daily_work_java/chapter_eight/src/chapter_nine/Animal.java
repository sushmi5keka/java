
package chapter_nine;

public class Animal {
    String name;
    String color;
    double age;
    String race;
    
    public Animal() {
    }

    public Animal(String name, String color, double age, String race) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.race = race;
    }
    
    
    
    void bite(){
        System.out.println("animal can bite");
    }
    
    void eat(){
        System.out.println("animal can eat");
    }
    
    void run(){
        System.out.println("animal can run");
    }
    
    public static void main(String[] args) {
        Animal jerry = new Animal();
        Animal lion = new Animal("Nova", "white", 5, "japanes");
        System.out.println(lion);
        System.out.println(jerry);
        
    }

    @Override
    public String toString() {
        return "Animal{" + "name=" + name + ", color=" + color + ", age=" + age + ", race=" + race + '}';
    }

    
    
}
