
package chapter_nine;

public class Dog {
    String name;
    double age;
    String color;
    
    public static void main(String[] args) {
        Dog d = new Dog();
        d.setName("Killer");
        d.setAge(15);
        d.setColor("Brown");
        System.out.println("Name : " + d.getName());
        System.out.println("Age : " + d.getAge());
        System.out.println("Color: " + d.getColor());
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public double getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }
    
    
    
    
    
}
