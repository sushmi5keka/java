
                         public class Student {
    
    int Id ;
    String Name ;
    String Email;

    public Student() {
        
    }

    public Student(int Id, String Name, String Email) {
        this.Id = Id;
        this.Name = Name;
        this.Email = Email;
    }

   

    public int getId() {
        return Id;
    }

    public String getName() {
        return Name;
    }

    public String getEmail() {
        return Email;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
    
    
    
}
