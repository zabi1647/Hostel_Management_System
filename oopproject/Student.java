package oopproject;

import java.io.Serializable;

public class Student extends Person implements Serializable{
    private String username ;
    private String password;
    private int fee;
    private Rooms r1;
    public Student(){
        
    }
    public Student(String username, String password,String name, int age, String phoneNumber, String id, int fee, Rooms r1) {
        super(name, age, phoneNumber, id);
        this.username = username;
        this.password = password;
        this.fee = fee;
        this.r1 = r1;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public void setfee(int fee) {
        this.fee = fee;
    }
    public int getfee() {
        return fee;
    }

    public Rooms getR1() {
        return r1;
    }

    public void setR1(Rooms r1) {
        this.r1 = r1;
    }
}
