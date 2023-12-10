/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Enterprise.Items;
import Business.Enterprise.ServiceTypes;
import java.util.ArrayList;

/**
 *
 * @author ashish
 */
public class StudentRequestOrder {
    private int reqId;
    private static int counter=1;
    private String status;
    private String studentName;
    private int studentId;
    private String goal;
    private String  studentUserName;
    private ArrayList<Items> itemsList;
    private ArrayList<ServiceTypes> serviceList;
    private String feedback;
    
    public StudentRequestOrder() {
        reqId = counter;
        ++counter;
        itemsList=new ArrayList<>();
        serviceList = new ArrayList<>();
    }

    public ArrayList<Items> getItemsList() {
        return itemsList;
    }

    public void setItemsList(ArrayList<Items> itemsList) {
        this.itemsList = itemsList;
    }
    
    public ArrayList<ServiceTypes> getServiceList() {
        return serviceList;
    }

    public void setServiceList(ArrayList<ServiceTypes> serviceList) {
        this.serviceList = serviceList;
    }

    public int getReqId() {
        return reqId;
    }

    public void setReqId(int reqId) {
        this.reqId = reqId;
    }

    public String getGoal() {
        return goal;
    }

    public void setGoal(String goal) {
        this.goal = goal;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentUserName() {
        return studentUserName;
    }

    public void setStudentUserName(String studentUserName) {
        this.studentUserName = studentUserName;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    @Override
    public String toString() {
        return Integer.toString(this.reqId);
    }
}
