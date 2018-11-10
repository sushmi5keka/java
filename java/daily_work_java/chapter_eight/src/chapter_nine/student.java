
package chapter_nine;

public class student {
   int id;
   String name;

    public student() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    
    
    public student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {
        student s = new student();
        s.setId(11);
        s.setName("moly");
         System.out.println(s);
         
         
        student st = new student(1, "ria");
       
        System.out.println(st);
        
    }
    
    
    @Override
    public String toString() {
        return "student{" + "id=" + id + ", name=" + name + '}';
    }
   
   
    
}
