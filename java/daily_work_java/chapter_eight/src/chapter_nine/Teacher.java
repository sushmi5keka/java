package chapter_nine;
// setter & getter based

public class Teacher {
// step 1 : instance variable declare

    int id;
    String name;
    String educationQualification;
    // step 2 : take defalt constant (optional)
    //step 3 : create setters methods
    // step 4 : take main mathod or any method (optional)

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEducationQualification(String educationQualification) {
        this.educationQualification = educationQualification;
    }

    public static void main(String[] args) {
        // step 5 : creat object using default constant
        Teacher t = new Teacher();
         Teacher t2 = new Teacher();
        // step 6 : set value with object
        t.setId(15);
        t.setName("reza");
        t.setEducationQualification("MBA");
        System.out.println(t);
        
         t2.setId(17);
        t2.setName("rezaul");
        t2.setEducationQualification("MBA");
        System.out.println(t);
        
        System.out.println("ID : " + t.getId());
        System.out.println("Name : " + t.getName());
        System.out.println("Educational Qualification : " + t.getEducationQualification());
        
          System.out.println("ID : " + t2.getId());
        System.out.println("Name : " + t2.getName());
        System.out.println("Educational Qualification : " + t2.getEducationQualification());
    }
    //step 7 genaret getter

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEducationQualification() {
        return educationQualification;
    }
    
}
