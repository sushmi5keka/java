
package eve;

public class Stu {

    private int id;
    private String name;
    private int age;
    private String gender;
    private String round;
    private String hobby;
   private String email;
    private String password;
    private String note;

    public Stu() {
    }
    
    public Stu (int id,String name,int age,String gender,String round,String hobby,String email,String password,String note){
   this.id = id;
        this.name = name ;
    this.age = age;
    this.gender = gender;
    this.round = round;
    this.hobby =hobby;
    this.email = email;
    this.password = password;
    this.note = note ;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getRound() {
        return round;
    }

    public String getHobby() {
        return hobby;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getNote() {
        return note;
    }
    
    
    
}
