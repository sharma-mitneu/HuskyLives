/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Enterprise.ServiceTypes;
import java.util.ArrayList;

/**
 *
 * @author srira
 */
public class MaintenanceWorkRequest extends WorkRequest {
    
    private ArrayList<ServiceTypes> cusList;
    private String cusMessage;
    private int totalBill = 0;

    public MaintenanceWorkRequest() {} 
    
    public ArrayList<ServiceTypes> getCusList() {
        return cusList;
    }

    public void setCusList(ArrayList<ServiceTypes> cusList) {
        this.cusList = cusList;
    }

    public String getCusMessage() {
        return cusMessage;
    }

    public void setCusMessage(String cusMessage) {
        this.cusMessage = cusMessage;
    }
    public int getTotalBill() {
        return totalBill;
    }

    public void setTotalBill(int totalBill) {
        this.totalBill = totalBill;
    }
}
