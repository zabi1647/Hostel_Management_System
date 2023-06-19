package oopproject;

import java.io.*;
import java.util.ArrayList;

public class FileHandling implements FileHandlingMethods{


    @Override
    public boolean addRecord(ArrayList<Student> s) {
        try {
            File f = new File("student.txt");
            ObjectOutputStream myobj = new ObjectOutputStream(new FileOutputStream(f));
            myobj.writeObject(s);
            myobj.close();
            return true;
        } catch (IOException e) {
           
            System.out.println(e.getMessage());
            return false;
        }
    }





    @Override
    public boolean deleteRecord(String userName) {
        ArrayList<Student> list = new ArrayList<Student>();
        boolean condi = false;
        try {
            ObjectInputStream obj = new ObjectInputStream(new FileInputStream("student.txt"));
            list = ( ArrayList<Student> ) obj.readObject();

            obj.close();
            for (Student i : list) {
                if (userName.equals(i.getUsername())) {
                    list.remove(i);
                    condi = true;
                }
            }
                
            
            
        }  catch (Exception e) {
            System.out.println();
            
            
        }
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("student.txt"));
            objectOutputStream.writeObject(list);
            objectOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return condi;
    }


    @Override
    public boolean searchByUsername(String username){
        ArrayList<Student> list = new ArrayList<Student>();
        boolean flag = false;
        try {
            ObjectInputStream obj = new ObjectInputStream(new FileInputStream("student.txt"));
            list =(ArrayList<Student>)obj.readObject();
            obj.readObject();
        }catch (IOException e){
            System.out.println("Some IO erro accured");
        }catch (Exception e){
            System.out.println("Some error accured");
        }
        for (Student student : list) {
            if (username.equals(student.getUsername())) {
                flag = true;
            }
        }
        return flag;
    }

    


}





