/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Inventory;

import Business.Organization.Organization;
import Business.Role.DormInventoryManagerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author srira
 */
public class DormInventory{
    
    String itemName;
    int price;
    
    public String getItemName() {
        return itemName;
    }

    public void setItemName(String ItemName) {
        this.itemName = ItemName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    @Override
    public String toString(){
       return itemName;
    }
}
