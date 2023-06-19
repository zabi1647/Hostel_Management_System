package oopproject;

import java.io.Serializable;

public class Complain implements Serializable{
    private String complain;
    private String name ;

    public Complain(String name,String complain) {
        this.name = name;
        this.complain = complain;
    }

    public String getComplain() {
        return complain;
    }

    public void setComplain(String complain) {
        this.complain = complain;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}