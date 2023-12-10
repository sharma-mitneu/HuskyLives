/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Enterprise.Enterprise;
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
      /*public StudentRequestOrder searchOrder(String enterpriseName){
        for (StudentRequestOrder order: studReqOrderList) {
            if (order.getRestaurantName().equalsIgnoreCase(enterpriseName)) {
                return order;
            }
        }
        return null;
      }
      public Order updateOrder(Order order, String name, String address){
             order.setRestaurantName(name);
             return order;
         }*/
}
