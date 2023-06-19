package oopproject;

import java.io.*;
import java.util.ArrayList;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class StudentOperations {
    Complain c1;

    public boolean signin(String username, String password){
        ArrayList<Student> arr = new ArrayList<Student>();
        boolean condi = false;
        try {
            ObjectInputStream obj = new ObjectInputStream(new FileInputStream("student.txt"));
            arr = (ArrayList<Student>) obj.readObject();
            obj.close();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
        for (Student i : arr) {
            if (username.equals(i.getUsername())&&password.equals(i.getPassword())) {
                condi = true;
                
            }
        }
        return condi;
    }
    public boolean addComplain(String name, String complain){
        ArrayList<Complain> array = new ArrayList<Complain>();
        File f = new File("Complains.txt");
        c1 = new Complain(name, complain);
        if (f.exists()){
            try {
                ObjectInputStream obj = new ObjectInputStream(new FileInputStream("Complains.txt"));
                array = (ArrayList<Complain>) obj.readObject();
                obj.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        array.add(c1);
        try {
            ObjectOutputStream myobj = new ObjectOutputStream(new FileOutputStream(f));
            myobj.writeObject(array);
            myobj.close();
            return true;
        } catch (IOException e) {
           
            return false;
        }
    }

    public void showAllComplains(JTable table){
        
        ArrayList<Complain> arr = new ArrayList<Complain>();
        try {
            ObjectInputStream obj = new ObjectInputStream(new FileInputStream("Complains.txt"));
            arr = (ArrayList<Complain>) obj.readObject();
            obj.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        DefaultTableModel model = new DefaultTableModel();

        // giving name to each attribute 


        model.addColumn("Name");
        model.addColumn("Complain");
        

        // fetching data from the array lis and saving it in object for printing in the table 

        for (Complain i : arr) {
            String name = i.getName();
            String complain =i.getComplain(); 
            model.addRow(new Object[]{name,complain});
        }
        table.setModel(model);
    }
    public void displayComplain(){
        ArrayList<Complain> arr = new ArrayList<Complain>();
        try {
            ObjectInputStream obj = new ObjectInputStream(new FileInputStream("Complains.txt"));
            arr = (ArrayList<Complain>) obj.readObject();
            obj.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        for (Complain i : arr) {
            System.out.println("name  = "+i.getName());
            System.out.println("complain = "+i.getComplain());
        }
    }
    public  boolean idchecker(String cnic ){
        if (cnic.length()!=13){
            return false;
        }
        boolean card = false;
        int count = 0;
        if (cnic.length()==13){
            for (int i=0;i<cnic.length();i++){
                if (cnic.charAt(i)>='0' && cnic.charAt(i)<='9'){
                    count++;
                }
            }
            if (count==13){
                card=true;
            }
        }else
            return card;
        return card;
    }

     // for checking phone no 

     public boolean phonenumberchecker(String phone){
        boolean number = false;
        int count = 0;
        if (phone.length()==11){
           for (int i = 0; i<phone.length();i++){
               if (phone.charAt(i)>='0'&& phone.charAt(i)<='9'){
                   count++;
               }
           }

           if (count==11) {
               number = true;
           }
        }else
            return number;
        return number;
    }
}
