package oopproject;
import java.io.*;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class AdminOperations implements Serializable {
    private String adminfile = "admin.txt";
    private ArrayList<Signup> array;

    public AdminOperations() {
        array = new ArrayList<Signup>();
    }

    public boolean addStudent(Student s1) {
        ArrayList<Student> arr = new ArrayList<Student>();
        File f = new File("student.txt");
        if (f.exists()){
            try {
                ObjectInputStream obj = new ObjectInputStream(new FileInputStream("student.txt"));
                arr = (ArrayList<Student>) obj.readObject();
                obj.close();
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println(e.getMessage());
            }
        }
        
        FileHandling f1 = new FileHandling();
        
        arr.add( s1);
        if (f1.addRecord(arr)) {
            return true;
        }else
            return false;
        
    }

    public boolean signin(String username, String password) {
        boolean condi = false;

        try {
            FileInputStream f1 = new FileInputStream(adminfile);
            ObjectInputStream ois = new ObjectInputStream(f1);
            array = (ArrayList<Signup>) ois.readObject();
            ois.close();
            f1.close();

            for (Signup i : array) {
                if (i.getUserName().equals(username) && i.getPassword().equals(password)) {
                    condi = true;
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            condi = false;
        }

        return condi;
    }

    public boolean signup(String username, String password) {
        Signup s1 = new Signup(username, password);
        array.add(s1);
        boolean condi = false;

        try {
            FileOutputStream fileout = new FileOutputStream(adminfile);
            ObjectOutputStream oos = new ObjectOutputStream(fileout);
            oos.writeObject(array);
            fileout.close();
            oos.close();
            condi = true;
        } catch (Exception e) {
            condi = false;
        }

        return condi;
    }

    public boolean updateUsername(String Username, String newUserName) {
        try {
            FileInputStream f1 = new FileInputStream(adminfile);
            ObjectInputStream ois = new ObjectInputStream(f1);
            array = (ArrayList<Signup>) ois.readObject();
            ois.close();
            f1.close();

            for (Signup i : array) {
                if (i.getUserName().equals(Username)) {
                    i.setUserName(newUserName);
                }
            }

            FileOutputStream fileout = new FileOutputStream(adminfile);
            ObjectOutputStream oos = new ObjectOutputStream(fileout);
            oos.writeObject(array);
            fileout.close();
            oos.close();
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public boolean updatePassword(String Username, String newPassword) {
        try {
            FileInputStream f1 = new FileInputStream(adminfile);
            ObjectInputStream ois = new ObjectInputStream(f1);
            array = (ArrayList<Signup>) ois.readObject();
            ois.close();
            f1.close();

            for (Signup i : array) {
                if (i.getUserName().equals(Username)) {
                    i.setPassword(newPassword);
                }
            }

            FileOutputStream fileout = new FileOutputStream(adminfile);
            ObjectOutputStream oos = new ObjectOutputStream(fileout);
            oos.writeObject(array);
            fileout.close();
            oos.close();
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
    


    //  for displaying students 

    
    public void display(String username){
        FileHandling file = new FileHandling();
        ArrayList<Student> arr = new ArrayList<Student>();
        try {
            FileInputStream f1 = new FileInputStream("student.txt");
            ObjectInputStream ois = new ObjectInputStream(f1);
            arr = (ArrayList<Student>) ois.readObject();
            f1.close();
            ois.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        if (file.searchByUsername(username)) {
            for (Student student : arr) {
                if (username.equals(student.getUsername())) {
                    JOptionPane.showMessageDialog(null, toString(student));
                }
            }
            
        }else{
            JOptionPane.showMessageDialog(null, "Student not found");
        }
    }

    // for showing all the data of student on table 


    public void showAllStudents(JTable table){
        
        ArrayList<Student> arr = new ArrayList<Student>();
        try {
            ObjectInputStream obj = new ObjectInputStream(new FileInputStream("student.txt"));
            arr = (ArrayList<Student>) obj.readObject();
            obj.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        DefaultTableModel model = new DefaultTableModel();

        // giving name to each attribute 


        model.addColumn("Name");
        model.addColumn("Age");
        model.addColumn("Cnic");
        model.addColumn("Phone no");
        model.addColumn("Room no");


        // fetching data from the array lis and saving it in object for printing in the table 

        for (Student i : arr) {
            String name = i.getName();
            String id = i.getId();
            String age = String.valueOf(i.getAge());
            String phone = i.getPhoneNumber();
            String room = String.valueOf(i.getR1().roomNO);
            model.addRow(new Object[]{name,age,id,phone,room});
        }
        table.setModel(model);
    }

    // for printing data for single student 


    public String toString(Student i){
        return "Name = " +i.getName()+"\nage = "+i.getAge()+"\nphone no = "+i.getPhoneNumber()+"\nCnic = "+i.getId()+"\nfee = "+i.getfee()+"\nRoom no = "+i.getR1().getRoomNO();
    }

    // for changing username 
    public void changeUsername(String username, String newUsername){
        FileHandling file = new FileHandling();
        ArrayList<Student> arr = new ArrayList<Student>();
        if (file.searchByUsername(username)) {
            try {
                ObjectInputStream obj = new ObjectInputStream(new FileInputStream("student.txt"));
                arr = (ArrayList<Student>) obj.readObject();
                obj.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            // after getting data from  student file changing in it 
            for (Student student : arr) {
                if (username.equals(student.getUsername())) {
                    student.setUsername(newUsername);
                }
            }
            Boolean saveStudent =  file.addRecord(arr);
            if (saveStudent) {
                JOptionPane.showMessageDialog(null, "Student data save ");
            } else {
                JOptionPane.showMessageDialog(null, "Student not found");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Student not found");
        }
        
    }

    // for changing password 
    public void changePassword(String username, String password){
        FileHandling file = new FileHandling();
        ArrayList<Student> arr = new ArrayList<Student>();
        if (file.searchByUsername(username)) {
            try {
                ObjectInputStream obj = new ObjectInputStream(new FileInputStream("student.txt"));
                arr = (ArrayList<Student>) obj.readObject();
                obj.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            // after getting data from  student file changing in it 
            for (Student student : arr) {
                if (username.equals(student.getUsername())) {
                    student.setPassword(password);
                }
            }
            Boolean saveStudent =  file.addRecord(arr);
            if (saveStudent) {
                JOptionPane.showMessageDialog(null, "Student data save ");
            } else {
                JOptionPane.showMessageDialog(null, "Student not found");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Student not found");
        }
        
    }

    // for changing name 
    public void changeName(String username, String name){
        FileHandling file = new FileHandling();
        ArrayList<Student> arr = new ArrayList<Student>();
        if (file.searchByUsername(username)) {
            try {
                ObjectInputStream obj = new ObjectInputStream(new FileInputStream("student.txt"));
                arr = (ArrayList<Student>) obj.readObject();
                obj.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            // after getting data from  student file changing in it 
            for (Student student : arr) {
                if (student.getUsername().equals(username)) {
                    student.setName(name);
                }
            }
            Boolean saveStudent =  file.addRecord(arr);
            if (saveStudent) {
                JOptionPane.showMessageDialog(null, "Student data save ");
            } else {
                JOptionPane.showMessageDialog(null, "Student not found");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Student not found");
        }
        
    }

    // for changing age
    public void changeAge(String username, int age){
        FileHandling file = new FileHandling();
        ArrayList<Student> arr = new ArrayList<Student>();
        if (file.searchByUsername(username)) {
            try {
                ObjectInputStream obj = new ObjectInputStream(new FileInputStream("student.txt"));
                arr = (ArrayList<Student>) obj.readObject();
                obj.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            // after getting data from  student file changing in it 
            for (Student student : arr) {
                if (student.getUsername().equals(username)) {
                    student.setAge(age);
                }
            }
            Boolean saveStudent =  file.addRecord(arr);
            if (saveStudent) {
                JOptionPane.showMessageDialog(null, "Student data save ");
            } else {
                JOptionPane.showMessageDialog(null, "Student not found");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Student not found");
        }
        
    }

    // for changing cnic
    public void changeCnic(String username, String cnic){
        FileHandling file = new FileHandling();
        ArrayList<Student> arr = new ArrayList<Student>();
        if (file.searchByUsername(username)) {
            try {
                ObjectInputStream obj = new ObjectInputStream(new FileInputStream("student.txt"));
                arr = (ArrayList<Student>) obj.readObject();
                obj.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            // after getting data from  student file changing in it 
            for (Student student : arr) {
                if (student.getUsername().equals(username)) {
                    student.setId(cnic);
                }
            }
            Boolean saveStudent =  file.addRecord(arr);
            if (saveStudent) {
                JOptionPane.showMessageDialog(null, "Student data save ");
            } else {
                JOptionPane.showMessageDialog(null, "Student not found");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Student not found");
        }
        
    }
    // for changing phone
    public void changePhoneNo(String username, String phoneNO){
        FileHandling file = new FileHandling();
        ArrayList<Student> arr = new ArrayList<Student>();
        if (file.searchByUsername(username)) {
            try {
                ObjectInputStream obj = new ObjectInputStream(new FileInputStream("student.txt"));
                arr = (ArrayList<Student>) obj.readObject();
                obj.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            // after getting data from  student file changing in it 
            for (Student student : arr) {
                if (student.getUsername().equals(username)) {
                    student.setPhoneNumber(phoneNO);
                }
            }
            Boolean saveStudent =  file.addRecord(arr);
            if (saveStudent) {
                JOptionPane.showMessageDialog(null, "Student data save ");
            } else {
                JOptionPane.showMessageDialog(null, "Student not found");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Student not found");
        }
        
    }

    // for changing age
    public void CalculateFee(String username){
        FileHandling file = new FileHandling();
        ArrayList<Student> arr = new ArrayList<Student>();
        int fee = 0;
        if (file.searchByUsername(username)) {
            try {
                ObjectInputStream obj = new ObjectInputStream(new FileInputStream("student.txt"));
                arr = (ArrayList<Student>) obj.readObject();
                obj.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            // after getting data from  student file changing in it 
            for (Student student : arr) {
                if (student.getUsername().equals(username)) {
                    fee = student.getfee();
                }
            }
            
            if (fee==12000) {
                JOptionPane.showMessageDialog(null, "Your fee is  = 12000\nmess fee = 0\nlaundary fee = 0 \ntotal = 12000");
            }else if(fee==13000){
                JOptionPane.showMessageDialog(null, "Your fee is  = 12000\nmess fee = 0\nlaundary fee = 1000 \ntotal = 13000");
            }else if(fee==17000){
                JOptionPane.showMessageDialog(null, "Your fee is  = 12000\nmess fee = 5000\nlaundary fee = 0 \ntotal = 17000");
            }else if(fee ==18000){
                JOptionPane.showMessageDialog(null, "Your fee is  = 12000\nmess fee = 5000\nlaundary fee = 1000 \ntotal = 18000");
            }
             else {
                JOptionPane.showMessageDialog(null, "Student not found");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Student not found");
        }
        
    }
}
