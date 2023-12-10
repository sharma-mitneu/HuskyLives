/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Student;

import java.util.ArrayList;

/**
 *
 * @author ashish
 */
public class StudentDirectory {
    
    private ArrayList<Student> studentList;

    public StudentDirectory() {
        studentList = new ArrayList<>();
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }
    
    public Student createStudent(Student student){
        studentList.add(student);
        return student;
    }
    
    public void removeStudent(Student c){
        studentList.remove(c);
    }
    
    public boolean checkIfUsernameIsUnique(String email){
        for (Student e : studentList){
            if (e.getEmail().equals(email))
                return false;
        }
        return true;
    }
    
    public Student updateStudent(Student cus, String name, Double height, Double weight, String gender, int age, String address, String city, String zipcode){
        cus.setName(name);
        cus.setHeight(height);
        cus.setWeight(weight);
        cus.setGender(gender);
        cus.setAge(age);
        cus.setAddress(address);
        cus.setCity(city);
        
        return cus;
    } 
    
}

