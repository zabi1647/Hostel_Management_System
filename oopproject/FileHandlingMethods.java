package oopproject;

import java.util.ArrayList;

public interface FileHandlingMethods {
    public boolean addRecord(ArrayList<Student> s);
    /*
    1. UserName;
    2. Password;
    1. Name;
    3. age;
    4. PHoneNum
    4. CNIC
    5. Fee
    6. RoomNo;
     */




    public boolean deleteRecord(String userName);

    // public void displayRecord();
    public boolean searchByUsername(String name);

}
