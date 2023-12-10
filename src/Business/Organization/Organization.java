/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Student.StudentDirectory;
import Business.Employee.EmployeeDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author omkar
 */
public abstract class Organization {

    public String name;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private StudentDirectory studentDirectory;
    private int organizationID;
    private int min = 1000;
    private int max = 9999;
    private static int count = 0;

    
    public enum Type{
        
        Admin("Admin Organization"), 
        Nutrition("Nutrition Organization"), 
        Dietitian("Dietitian Organization"),
        WeightTraining("Weight Training"),
        FitnessTraining("Fitness Training"),
        Physiotherapist("Physiotherapist"),
        GeneralPractitioner("General Practitioner"),
        DormInventory("Dorm Inventory"),
        Delivery("DeliveryMan"),
        Service("Service"),
        ServiceWorker("Service Worker"),
        Lab("Lab Organization"),
        Doctor("Doctor Organisation");
        
        private String value;
        
        private Type(String value) {
            this.value = value;
        }
        
        public String getValue() {
            return value;
        }
        
    }

    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        studentDirectory = new StudentDirectory();
        Random r = new Random();
        count = r.nextInt(max-min) + min;
        organizationID = count;
    }

    public abstract ArrayList<Role> getSupportedRole();
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public StudentDirectory getStudentDirectory() {
        return studentDirectory;
    }

    public void setStudentDirectory(StudentDirectory studentDirectory) {
        this.studentDirectory = studentDirectory;
    }
    
    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }
    
    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return name;
    }
}
