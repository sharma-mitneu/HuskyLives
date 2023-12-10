/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author ashish
 */
public class StudentRequestDirectory {
     private ArrayList<StudentRequestOrder> studReqOrderList;

    public StudentRequestDirectory() {
        studReqOrderList = new ArrayList();
    }

    public ArrayList<StudentRequestOrder> getStudReqOrderList() {
        return studReqOrderList;
    }

    public void setStudReqOrderList(ArrayList<StudentRequestOrder> studReqOrderList) {
        this.studReqOrderList = studReqOrderList;
    } 

     public StudentRequestOrder createOrder(){
        StudentRequestOrder order = new StudentRequestOrder(); 
        studReqOrderList.add(order);
        return order;
    }
     
      public void deleteOrder(StudentRequestOrder order){
        studReqOrderList.remove(order); 
    }
}
