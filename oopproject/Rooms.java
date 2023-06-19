package oopproject;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Rooms implements Serializable{
    int roomNO;
    boolean roomAvailable;
    public Rooms(int roomNO) {
        this.roomNO = roomNO;
        
    }
    public int getRoomNO() {
        return roomNO;
    }
    public void setRoomNO(int roomNO) {
        this.roomNO = roomNO;
    }
    
    public boolean checkRoom(){
        roomAvailable = true;
        ArrayList<Student> arr = new ArrayList<Student>();
        try {
            FileInputStream f1 = new FileInputStream("student.txt");
            ObjectInputStream ois = new ObjectInputStream(f1);
            arr = (ArrayList<Student>)ois.readObject();
            f1.close();
            ois.close();    
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println();
        }
        for (Student i : arr) {
            if (i.getR1().roomNO==roomNO) {
                roomAvailable =  false;
            }
        }
        return roomAvailable;
    }
}
