
package com.coderbd.evedence;

public class Student {
    private String name;
    private String email;
    private int age;
    private String gender;
    private String password;
     private String hobby;
    private String round;
    private String note;
   
    public Student(){
    }
    
    public Student(String name,String email,int age,String gender,
            String password,String hobby,String round,String note){
        this.name=name;
        this.email=email;
        this.age=age;
        this.gender=gender;
        this.password=password;
        this.hobby=hobby;
        this.round=round;
        this.note=note;
    
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getPassword() {
        return password;
    }

    public String getHobby() {
        return hobby;
    }

    public String getRound() {
        return round;
    }

    public String getNote() {
        return note;
    }
    
    
    
    }
    
   
    
    

